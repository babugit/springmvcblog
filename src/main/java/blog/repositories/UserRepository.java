package blog.repositories;

import blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zillur on 9/21/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}