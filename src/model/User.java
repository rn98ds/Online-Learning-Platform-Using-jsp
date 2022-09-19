package model;

public class User
{
	public User(){}
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
public User(String name, String email, String password, int uid) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.uid = uid;
	}
  
private String name,email,password;
  private int uid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
}
