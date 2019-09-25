package PT2;

import java.io.File;

public class ex3 {
	public static void main(String[] args) {
		File theDir = new File("src\\\\PT2\\\\myFiles");

		// if the directory does not exist, create it
		if (!theDir.exists()) {
			System.out.println("creating directory: " + theDir.getName());
			boolean result = false;

			try {
				theDir.mkdir();
				result = true;
			} catch (SecurityException se) {
				// handle it
			}
			if (result) {
				System.out.println("DIR created");
			}
		}
	}
}
