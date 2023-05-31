package throwDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountManager manager = new AccountManager();
		manager.deposit(100);
		System.out.println("Hesap =" + manager.getBalance());
		try {
			manager.withdraw(110);

		} catch (BalanceInsufficentException e) {
			// TODO: handle exception
		System.out.println(	e.getMessage());
		}
	} 

}
