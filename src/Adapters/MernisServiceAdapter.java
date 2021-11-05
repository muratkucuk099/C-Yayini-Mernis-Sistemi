package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy kpspublic = new KPSPublicSoapProxy();
		
		return 	kpspublic.TCKimlikNoDogrula(customer.getNationalityId(), customer.getName(), customer.getLastName(), customer.getDateOfBirth());
	}

}
