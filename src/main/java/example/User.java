package example;

public class User extends Person {

	private String userName;
	private String password;

	public User(String firstName, String lastName, String userName, String password) {
		super(firstName, lastName);
		this.userName = userName;
		this.password = password;
	}

	public String getUserNamer() {
		return userName;
	}

	public void setUserNamer(String userNamer) {
		this.userName = userNamer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// modif 2
}
