package springbootstarter.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springbootstarter.user.User;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/users/{userId}/events")
	public List<Event> getAllUserEvents(@PathVariable String userId) {
		return eventService.getAllUserEvents(userId);
	}

	@RequestMapping("/users/events")
	public List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/users/{userId}/events")
	public void addEvent(@RequestBody Event event, @PathVariable String userId) {
		event.setUser(new User(userId, "", "", "", "", 0, "", "", ""));
		eventService.addEvent(event);
	}
}
