package Concrete;


import Abstract.IcustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements IcustomerCheckService {
    

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	
}
