package Entities;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"İsmail","Süren",1987,"15238955931"));
		
		System.out.println("*********************************************");
		
		/*
		 * BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new
		 * MernisServiceAdapter()); customerManager.Save(new
		 * Customer(1,"Şaban","Süren",0000,"00000000000"));
		 */

	}

}
