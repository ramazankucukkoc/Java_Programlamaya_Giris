package BTK;

import java.util.Scanner;

public class BtkAkademi_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String metin ="   Ben Ramazan Küçükkoç 1 0cak 1999 dogumluyum";
		//System.out.println(metin);
		
		System.out.println(metin.charAt(42));
		System.out.println(metin.endsWith("um"));
		System.out.println(metin.length());
		System.out.println(metin.trim());
		System.out.println(metin.substring(0,10));
		System.out.println(metin.isEmpty());

		Scanner konsolVeri = new Scanner(System.in);
		System.out.println("Sayıyı Giriniz : ");
		int sayi = konsolVeri.nextInt();
		int sayac = 0;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}
		}
		if (sayac == 0) {
			System.out.println(sayi + " Asal sayıdır.");
		} else {
			System.out.println(sayi + " Asal sayı değildir.");
		}

	}
}
