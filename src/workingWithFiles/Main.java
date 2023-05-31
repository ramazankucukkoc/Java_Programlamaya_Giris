package workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//createFile();
		//getFileInfo();
		readFile();
		
	}

	private static void createFile() {
		File file = new File("C:\\Users\\Ramazan\\OneDrive\\Masaüstü\\Java ile programlaya\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Dosya Oluşturuldu.");
			} else {
				System.out.println("Dosya zaten mevcut.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\Users\\Ramazan\\OneDrive\\Masaüstü\\Java ile programlaya\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya Adı" + file.getName());
			System.out.println("Dosya Yolu" + file.getAbsolutePath());
			System.out.println("Dosya  yazılabilir mi :" + file.canWrite());
			System.out.println("Dosya  yazılabilir mi :" + file.canRead());
			System.out.println("Dosya  boyutu (byte):" + file.length());

		}
	}
 	public static void readFile() {
		File file = new File("C:\\Users\\Ramazan\\OneDrive\\Masaüstü\\Java ile programlaya\\files\\students.txt");
 	    try {
			Scanner reader =new Scanner(file);
			while (reader.hasNextLine()) {
				String line =reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
 	}
 	
	

}
