package arraylistDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList sayilar = new ArrayList();

		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add("Ramazan");

		sayilar.set(1, "Ramo-1999");
		System.out.println(sayilar.get(0));
		sayilar.remove(0);
		System.out.println("-----------------");
		System.out.println(sayilar.get(0));
		for (int i = 0; i < sayilar.size(); i++) {
			System.out.println(sayilar.get(i));
		}
		
		
		ArrayList<String> sehirler =new ArrayList<String>();
		sehirler.add("İstanbul");
		sehirler.add("Adana");
		sehirler.add("Konya");
		sehirler.add("Ankara");
        Collections.sort(sehirler);
        System.out.println("-------------------");
        for (String sehir : sehirler) {
			System.out.println(sehir);
		}
		   ArrayList<Customer> customers=new ArrayList<Customer>();
		   
		   System.out.println("-----------------------------");
		   Customer ramazan =new Customer(1,"Ramazan","Küçükkoç");
		   customers.add(ramazan);
		   customers.add(new Customer(2,"Mustafa","Koç"));
		   customers.add(new Customer(3,"Ali","K.KOÇ"));
		 customers.remove(ramazan);
		   	for (Customer customer : customers) {
				System.out.println(customer.firstName +" "+customer.lastName);
			}
		
		
	}

}
