package org.mycompany;

//import java.util.Collection;
import java.util.Optional;

/**
 * Service interface for managing customers.
 */
public interface CustomersViewService {

	/**
	 * Find a customer by the given ID
	 *
	 * @param id the ID of the customer
	 * @return the customer, or <code>null</code> if customer not found.
	 */
	//Optional<CustomersView> findCustomersViews(Integer id);
	
	//CustomersView findCustomersViews(Integer id);

	/**
	 * Find all customers
	 *
	 * @return a collection of all customers
	 */
	Iterable<CustomersView> findCustomersViews();

}