package springbootstarter.event;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, String> {
	public List<Event> findByUserId(String userId);
	public List<Event> findAll();
}
 