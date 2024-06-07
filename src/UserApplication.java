import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		Scanner scanner = new Scanner(System.in);
		
		User[] users = new User[4];
		
		try {
			users = userService.readDataFromFile("data.txt");
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getLocalizedMessage());
			return;
		}
		
		int attempts = 0;
		final int MAX_ATTEMPTS = 5;
		boolean loggedIn = false;
		
		while (attempts < MAX_ATTEMPTS && !loggedIn) {
			System.out.println("Enter your email");
			String username = scanner.nextLine();
			System.out.println("Enter your password");
			String password = scanner.nextLine();
			
			User user = userService.validateUser(users, username, password);
			if (user != null) {
				System.out.println("Welcome " + user.getName());
				loggedIn = true;
			} else {
				System.out.println("Invalid login, please try again");
				attempts++;
			}
		}
			if (!loggedIn) {
				System.out.println("Too many failed login attempts, you are now locked out");
			}
			scanner.close();
			//just testing to see if I can push this new repository
			//if anything else changes I will see it in github desktop
	}

}
