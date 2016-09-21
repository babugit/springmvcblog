package blog.service;

import blog.model.User;

import java.util.List;

/**
 * Created by zillur on 9/21/16.
 */
public interface UserService {
    boolean authenticate(String username, String password);

    List<User> findAll();

    User findById(int id);

    User create(User user);

    User edit(User user);

    void deleteById(int id);
}
