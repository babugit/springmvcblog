package blog.service;

import blog.model.Post;

import java.util.List;

/**
 * Created by zillur on 9/20/16.
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLatest(int limit);
    Post findById(int id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(int id);
}