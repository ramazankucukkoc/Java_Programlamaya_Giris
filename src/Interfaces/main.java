package Interfaces;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //interface'ler bağımlılıklarımızı yönettimiz yerdir diyebiliriz.
	  //interface'ler tamamlanmamış olaylar içerir.
	 //bir class bir class extends eder
	//bir class birden fazla interface implement edebilir.
	//interface referans tutucu görevi görüyor diyebiliriz.
		 CustomerManager customerManager =new CustomerManager(new MySqlCustomerDal());
		 
		 customerManager.add(); 
		
		
		
		
	}

}
