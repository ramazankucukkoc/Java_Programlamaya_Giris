package staticdemo;

public class ProductValidator {
	//isEmpty boşdur demektir.
	//static yaparsak ProductValidator bir kere newlenir.(Utilitlerde kullanılır.)
	//static nesneler bellekten program çalıştıgında durur. "
	//constructor lar newlenince çalışır.static sınıflrada çalışmaz.
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
