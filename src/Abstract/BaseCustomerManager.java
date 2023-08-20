package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Veritabanına Kaydedildi: " + customer.getFirstName());
		System.out.println("Veritabanına Kaydedildi: " + customer.getLastName());
		System.out.println("Veritabanına Kaydedildi: " + customer.getDateOfBirth());
		
	}

}
