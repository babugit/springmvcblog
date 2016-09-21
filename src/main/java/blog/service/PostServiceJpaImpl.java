package blog.service;

import blog.model.Post;
import blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zillur on 9/21/16.
 */
@Service
@Primary
public class PostServiceJpaImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public List<Post> findLatest(int limit) {
        return this.postRepository.findLatest(new PageRequest(0, limit));
    }

    @Override
    public Post findById(int id) {
        return this.postRepository.findOne(id);
    }

    @Override
    public Post create(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post edit(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public void deleteById(int id) {
        this.postRepository.delete(id);
    }
}
