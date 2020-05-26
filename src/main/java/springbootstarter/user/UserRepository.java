package springbootstarter.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

	public User findUserByLogin(String userLogin);
//	public List<User> findByLogin(String login);
}
 