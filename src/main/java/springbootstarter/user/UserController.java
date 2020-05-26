package springbootstarter.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users/{userLogin}/{userPassword}")
	public ResponseEntity<User> Authorize(@PathVariable String userLogin, @PathVariable String userPassword) {
		User userData = userService.findUserByLogin(userLogin);
		if (userData.getPassword().equals(userPassword)) {
			return new ResponseEntity<User>(userData,HttpStatus.OK);}
		else
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody User user) {
		System.out.print("user " + user.getLogin()+ ":" + user.getPassword() + " was creater");
		userService.addUser(user);
	}
}
