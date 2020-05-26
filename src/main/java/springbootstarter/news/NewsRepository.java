package springbootstarter.news;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, String> {
	public List<News> findByUserId(String userId);
	public List<News> findAll();
}
 