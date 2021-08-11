package model;

public class Account {

	private Integer id;
	private String username;
	private String passw;
	
	
	public Account() {}
	public Account(String username, String passw) {
		this.username = username;
		this.passw = passw;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", username=" + username + ", passw=" + passw + "]";
	}
	
}
