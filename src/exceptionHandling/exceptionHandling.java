package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try {
			int[] sayilar =new int[] {1,2,3};
			System.out.println(sayilar[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			System.out.println("Ben her türlü çalışırım.");
		}
		BufferedReader reader =new BufferedReader(new FileReader("sayilar"));
		
		
	}

}
