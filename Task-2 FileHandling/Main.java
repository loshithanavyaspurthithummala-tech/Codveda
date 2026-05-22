import java.io.*;

public class Main {

	public static void main (String[] args) {

		// File names
		String inputFile = "input.txt";
		String outputFile = "output.txt";

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		try {

			// Reading data from input file
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));

			String line;

			while ((line = reader.readLine()) != null) {

				// Count lines
				lineCount++;

				// Count characters
				charCount += line.length();

				// Count words
				if (!line.trim().isEmpty()) {
					String[] words = line.trim().split("\\s+");
					wordCount += words.length;
				}
			}

			reader.close();

			// Writing processed data to output file
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

			writer.write("===== FILE PROCESSING REPORT =====");
			writer.newLine();
			writer.write("Total Lines      : " + lineCount);
			writer.newLine();
			writer.write("Total Words      : " + wordCount);
			writer.newLine();
			writer.write("Total Characters : " + charCount);
			writer.newLine();
			writer.write("Status           : Processing Completed Successfully");

			writer.close();

			System.out.println("File processed successfully!");
			System.out.println("Output saved in " + outputFile);

		}

		// Exception if file is not found
		catch (FileNotFoundException e) {
			System.out.println("Error: Input file not found.");
		}

		// Exception for file handling errors
		catch (IOException e) {
			System.out.println("Error while reading or writing the file.");
		}
	}
}
