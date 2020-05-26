package springbootstarter.comment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springbootstarter.event.Event;
import springbootstarter.user.User;

@Entity  
public class Comment {
	
	@Id
	private String id;
	private String text;
	private String timestamp;
	private String userId;
	private String eventId;
	
	public Comment() {
		
	}
	
	public Comment(String id, String text, String timestamp, String userId, String eventId) {
		super();
		this.id = id;
		this.text = text;
		this.timestamp = timestamp;
		this.userId = userId;
		this.eventId = eventId;
	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getText() {return text;}
	public void setText(String text) {this.text = text;	}
	public String getTimestamp() {return timestamp;	}
	public void setTimestamp(String timestamp) {this.timestamp = timestamp;	}
	public String getUserId() {	return userId;	}
	public void setUserId(String userId) {this.userId = userId;}
	public String getEventId() {return eventId;}
	public void setEventId(String event) {this.eventId = eventId;}
	
	
}
