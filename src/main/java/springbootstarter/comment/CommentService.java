package springbootstarter.comment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	public List<Comment> getAllEventComments(String eventId){
		List<Comment> comments = new ArrayList<>();
		commentRepository.findByEventId(eventId)
		.forEach(comments::add);
		return comments;
	}

	public void addEvent(Comment comment) {
		commentRepository.save(comment);
	}

	public void updateComment(Comment comment) {
		commentRepository.save(comment);
	}

	public void deleteComment(String id) {
		commentRepository.deleteById(id);
	}
}
