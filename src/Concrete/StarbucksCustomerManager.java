package Concrete;

import Abstract.BaseCustomerManager;

import Abstract.IcustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    public StarbucksCustomerManager(IcustomerCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    private IcustomerCheckService personCheckService;

    @Override
    public void Save(Customer customer)  {

        if(personCheckService.CheckIfRealPerson(customer)){
        	super.Save(customer);
           
        }else {
           System.out.println ("Kullanici Gecerli degil:" );
        }
    }

}
