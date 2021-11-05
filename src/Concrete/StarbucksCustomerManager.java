package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws RemoteException {
		
		if (_customerCheckService.checkIfRealPerson(customer)) {
		
			super.Save(customer);
		}else {
			System.out.println("Not a valid person!");
		}
		
	}
	
	

	

}
