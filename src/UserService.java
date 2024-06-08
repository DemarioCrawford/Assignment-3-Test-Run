import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
//load users from a file and return an array of User objects
	public User[] readDataFromFile(String filename) throws IOException {
		FileService fileService = new FileService();
		List<String> lines = fileService.readFile(filename);
		List<User> usersList = new ArrayList<>();

		for (String line : lines) {
			String[] parts = line.split(",");
			if (parts.length == 3) {
				String username = parts[0].trim();
				String password = parts[1].trim();
				String name = parts[2].trim();
				usersList.add(new User(username, password, name));
			} else {
				System.out.println("Invalid line format: " + line);
			}

		}
		return usersList.toArray(new User[0]);
	}
	//validate the user's info
	public User validateUser(User[] users, String username, String password) {
		for (User user: users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
		
	}

}
