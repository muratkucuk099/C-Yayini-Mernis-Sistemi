package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckService {
	
	public boolean checkIfRealPerson(Customer customer) throws RemoteException ;
	
	


}
