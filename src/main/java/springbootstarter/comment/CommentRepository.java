package springbootstarter.comment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, String> {
	public List<Comment> findByEventId(String userId);
}
 