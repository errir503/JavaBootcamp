package Absract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void add(Customer customer) {
		System.out.println("Saved to db : " + customer.getCustomerName());

	}

	public void update(Customer customer) {
		System.out.println("Updated !");
	}

	public void deleted(Customer customer) {
		System.out.println("Removed from db : " + customer.getCustomerName());
	}

}
