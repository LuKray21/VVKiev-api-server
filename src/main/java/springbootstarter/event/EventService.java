package springbootstarter.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> getAllUserEvents(String userId){
		List<Event> events = new ArrayList<>();
		eventRepository.findByUserId(userId)
		.forEach(events::add);
		return events;
	}
	
	public List<Event> getAllEvents(){
		return eventRepository.findAll();
	}
	
	public Event getEvent(String id) {
		return eventRepository.findById(id).orElse(null);
	}

	public void addEvent(Event event) {
		eventRepository.save(event);
	}

	public void updateEvent(Event event) {
		eventRepository.save(event);
	}

	public void deleteCourse(String id) {
		eventRepository.deleteById(id);
	}
}
