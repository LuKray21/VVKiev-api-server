package springbootstarter.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "userData")
public class User {
	
	@Id
	private String id;
	
	@Column(unique = true)
	private String login;
	private String name;
	private String surname;
	private String region;
	private int age;
	private String phone;
	private String email;
	private String password;

	public User() {
		
	}
	
	public User(String id, String name, String surname, String login, String region, int age, String phone, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.region = region;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	public String getId() {return id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	public String getLogin() {return login;}
	public void setLogin(String login) {this.login = login;}
	public String getRegion() {return region;}
	public void setRegion(String region) {this.region = region;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public void setId(String id) {this.id = id;}
}
