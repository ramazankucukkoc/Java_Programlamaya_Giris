package Interfaces;

public class CustomerManager {
	
	ICustomerDal customerDal;
	

	public CustomerManager(ICustomerDal customerDal) {
		//super();
		this.customerDal = customerDal;
	}


	public void add() {
		customerDal.Add();
	}
	
	
	
}
