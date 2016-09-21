package blog.controller;

import blog.model.Post;
import blog.service.NotificationService;
import blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zillur on 9/20/16.
 */
@Controller
public class PostsController {

    @Autowired
    private PostService postService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") int id, Model model) {
        Post post = postService.findById(id);
        if (post == null) {
            notificationService.addErrorMessage("Cannot find post #" + id);
            return "redirect:/";
        }
        model.addAttribute("post", post);
        return "posts/view";
    }
}
