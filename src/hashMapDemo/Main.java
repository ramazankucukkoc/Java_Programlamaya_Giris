package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //key - value hashMap mantığı

		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap");
		sozluk.put("computer", "bilgisayar");
		sozluk.put("table", "masa");
		sozluk.put("mouse", "fare");
		// sozluk.remove("table");
		// sozluk.clear();
		System.out.println(sozluk);

		for (String item : sozluk.keySet()) {
			System.out.println("Key -" + item + "-- Value-" + sozluk.get(item));
		}
		
	}

}
