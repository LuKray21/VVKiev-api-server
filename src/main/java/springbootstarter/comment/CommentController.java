package springbootstarter.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springbootstarter.event.Event;
import springbootstarter.user.User;

@RestController
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/events/{eventId}/comments")
	public List<Comment> getAllEventComments(@PathVariable String eventId) {
		return commentService.getAllEventComments(eventId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/events/{eventId}/comments")
	public void addComment(@RequestBody Comment comment, @PathVariable String eventId) {
		commentService.addEvent(comment);
	}
}
