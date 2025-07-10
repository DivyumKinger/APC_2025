package July_10_2025.O2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("CallToPrintStackTrace")
public class Main {
	public static void main(String[] args) {
		String file = "src/July_10_2025/O2/input.txt";
		String dest = "src/July_10_2025/O2/output.txt";
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(file);
			fw = new FileWriter(dest);
			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
			System.out.println("Text file copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}