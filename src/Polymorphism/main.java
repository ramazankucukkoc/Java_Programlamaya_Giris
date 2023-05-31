package Polymorphism;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseKrediManager[] baseKrediManager =new BaseKrediManager[] {new OgrenciKrediManager(),
				new OgretmenKrediManager(),new TarimKrediManager()};
		for(BaseKrediManager baseKrediManager2 :baseKrediManager) {
			System.out.println(baseKrediManager2.hesapla(1000));
		}
		
		
		
	}

}
