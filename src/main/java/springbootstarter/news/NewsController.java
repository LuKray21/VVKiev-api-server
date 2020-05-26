package springbootstarter.news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springbootstarter.user.User;

@RestController
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/users/{userId}/news")
	public List<News> getAllUserNews(@PathVariable String userId) {
		return newsService.getAllUserNews(userId);
	}

	@RequestMapping("/users/news")
	public List<News> getAllNews() {
		return newsService.getAllNews();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/users/{userId}/news")
	public void addNews(@RequestBody News news, @PathVariable String userId) {
		news.setUser(new User(userId, "", "", "", "", 0, "", "", ""));
		newsService.addNews(news);
	}
}
