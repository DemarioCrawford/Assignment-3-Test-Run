
public class User {
	//properties for the user
	private String username;
	private String password;
	private String name;
	//user constructor
	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	//getters and setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//override toString
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
