package springbootstarter.event;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springbootstarter.comment.Comment;
import springbootstarter.user.User;

@Entity  
public class Event {
	
	@Id
	private String id;
	private String title;
	private String description;
	private String timestamp;
	private String eventDate;
	private String eventPhone;
	private String eventEmail;
	private String eventRegion;
	private String eventAddress;
	
	@ManyToOne
	private User user;
	
	public Event() {
		
	}
	
	public Event(String id, String title, String description, String timestamp, String eventDate, String eventPhone, String eventEmail, String eventRegion, String eventAddress,String userId) {
		super();
		this.id = id;
		this.title = title;
		this.timestamp = timestamp;
		this.eventDate = eventDate;
		this.description = description;
		this.eventAddress = eventAddress;
		this.eventEmail = eventEmail;
		this.eventPhone = eventPhone;
		this.eventRegion = eventRegion;
		this.user = new User(userId, "", "", "", "", 0, "", "", ""); 
	}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;	}
	public String getTitle() {return title;	}
	public void setTitle(String title) {this.title = title;	}
	public String getDescription() {return description;	}
	public void setDescription(String description) {this.description = description;	}
	public String getTimestamp() {return timestamp;}
	public void setTimestamp(String timestamp) {this.timestamp = timestamp;	}
	public String getEventDate() {return eventDate;}
	public void setEventDate(String eventDate) {this.eventDate = eventDate;	}	
	public User getUser() {return user;}
	public void setUser(User user) {this.user = user;}

	public String getEventPhone() {
		return eventPhone;
	}

	public void setEventPhone(String eventPhone) {
		this.eventPhone = eventPhone;
	}

	public String getEventEmail() {
		return eventEmail;
	}

	public void setEventEmail(String eventEmail) {
		this.eventEmail = eventEmail;
	}

	public String getEventRegion() {
		return eventRegion;
	}

	public void setEventRegion(String eventRegion) {
		this.eventRegion = eventRegion;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}
	
}
