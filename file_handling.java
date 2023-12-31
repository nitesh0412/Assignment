
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file_handling {
	public static void main(String[] args) {
		BufferedReader br = null;

		int characterCount = 0;

		int wordCount = 0;

		int lineCount = 0;

		try {

			br = new BufferedReader(new FileReader("C:\\Users\\nitesh.kumawat\\Documents\\fileHandling.txt"));

			String line = br.readLine();

			while (line != null) {

				lineCount++;

				String[] words = line.split(" ");

				wordCount = wordCount + words.length;

				for (String word : words) {

					characterCount = characterCount + word.length();
				}

				line = br.readLine();
			}

			System.out.println("Number Of Chars In A File : " + characterCount);

			System.out.println("Number Of Words In A File : " + wordCount);

			System.out.println("Number Of Lines In A File : " + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// Number Of Chars In A File : 22
// Number Of Words In A File : 5
// Number Of Lines In A File : 1