package July_10_2025.O1;

import java.io.*;

@SuppressWarnings("ALL")
public class Main {
	public static void main(String[] args) {
		String filePath = "src/July_10_2025/O1/input.txt";     // Path of the source file
		String copyPath = "src/July_10_2025/O1/output.txt";    // Path of the destination file
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(filePath);
			// Wrap FileInputStream in BufferedInputStream
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(copyPath);
			// Wrap FileOutputStream in BufferedOutputStream
			bos = new BufferedOutputStream(fos);
			
			int b;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);  // Display content
				bos.write(b);                // Write content to new file
			}
			
			System.out.println("\nFile copied successfully.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				System.out.println("Error closing file: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}