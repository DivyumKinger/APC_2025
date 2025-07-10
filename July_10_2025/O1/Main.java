package July_10_2025.O1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("ALL")
public class Main {
	public static void main(String[] args) {
		String filePath = "/Users/divyumkinger/Documents/Files/SEM 5/JAVA_Class/src/July_10_2025/O1/input.txt";     // Path of the source file
		String copyPath = "/Users/divyumkinger/Documents/Files/SEM 5/JAVA_Class/src/July_10_2025/O1/output.txt";    // Path of the destination file
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(filePath);
			fos = new FileOutputStream(copyPath);
			
			int b;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);  // Display content
				fos.write(b);                // Write content to new file
			}
			
			System.out.println("\nFile copied successfully.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O error: " + e.getMessage());
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				System.out.println("Error closing file: " + e.getMessage());
			}
		}
	}
}