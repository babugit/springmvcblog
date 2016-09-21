package blog.service;

import blog.model.User;
import blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zillur on 9/21/16.
 */
@Service
@Primary
public class UserServiceJpaImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean authenticate(String username, String password) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return this.userRepository.findOne(id);
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User edit(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteById(int id) {
        this.userRepository.delete(id);
    }
}
