package blog.controller;

import blog.model.Post;
import blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zillur on 9/19/16.
 */
@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Post> posts = postService.findLatest(5);
        model.addAttribute("latest5Posts", posts);
        List<Post> postsb = posts.stream().limit(3).collect(Collectors.toList());
        model.addAttribute("latest3Posts", postsb);

        return "index";
    }
}
