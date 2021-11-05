import java.rmi.RemoteException;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new ICustomerCheckService() {
			
			@Override
			public boolean checkIfRealPerson(Customer customer) throws RemoteException {
				
				return false;
			}
		}
		);
		
		Customer customer = new Customer();
		
		customer.setDateOfBirth(1999);
		customer.setName("MURAT");
		customer.setLastName("KÜÇÜK");
		customer.setNationalityId(31564044872L);
		
		customerManager.Save(customer);
		
		
		
		
		
	}

}
