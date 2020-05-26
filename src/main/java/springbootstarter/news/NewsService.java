package springbootstarter.news;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
	
	@Autowired
	private NewsRepository newsRepository;
	
	public List<News> getAllUserNews(String userId){
		List<News> news = new ArrayList<>();
		newsRepository.findByUserId(userId)
		.forEach(news::add);
		return news;
	}
	
	public List<News> getAllNews(){
		return newsRepository.findAll();
	}
	
	public News getNews(String id) {
		return newsRepository.findById(id).orElse(null);
	}

	public void addNews(News news) {
		newsRepository.save(news);
	}

	public void updateNews(News news) {
		newsRepository.save(news);
	}

	public void deleteNews(String id) {
		newsRepository.deleteById(id);
	}
}
