import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	// read the file line by line and return the lines as a List of Strings
	public List<String> readFile(String filename) throws IOException {
		List<String> lines = new ArrayList<>();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
		}
		return lines;
	}
}
