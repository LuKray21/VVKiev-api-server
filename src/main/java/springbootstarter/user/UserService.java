package springbootstarter.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}

	public User findUserByLogin(String userLogin) {
		return userRepository.findUserByLogin(userLogin);
	}

	public void addUser(User user) {
		userRepository.save(user);
	}
}
