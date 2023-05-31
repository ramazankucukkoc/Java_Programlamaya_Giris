package staticdemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManager manager =new ProductManager();
		Product product =new Product();
		product.id=1;
		product.name="Bardak";
		product.price=10;
		manager.add(product);
		
	}

}
