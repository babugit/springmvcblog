package blog.service;

import blog.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by zillur on 9/21/16.
 */
@Service
public class UserServiceStubImpl implements UserService {
    @Override
    public boolean authenticate(String userName, String password) {
        // Provide a sample password check: username == password
        return Objects.equals(userName, password);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User edit(User user) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
