package springbootstarter.news;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springbootstarter.comment.Comment;
import springbootstarter.user.User;

@Entity  
public class News {
	
	@Id
	private String id;
	private String title;
	private String text;
	private String timestamp;
	
	@ManyToOne
	private User user;
	
	public News() {
		
	}
	
	public News(String id, String title, String description, String timestamp, String eventDate, String eventPhone, String eventEmail, String eventRegion, String eventAddress,String userId) {
		super();
		this.id = id;
		this.title = title;
		this.timestamp = timestamp;
		this.text = text;
		this.user = new User(userId, "", "", "", "", 0, "", "", ""); 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
