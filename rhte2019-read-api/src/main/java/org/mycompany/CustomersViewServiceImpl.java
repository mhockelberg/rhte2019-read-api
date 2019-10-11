package org.mycompany;

//import java.util.Collection;
//import java.util.Map;
import java.util.Optional;
//import java.util.TreeMap;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import javax.persistence.criteria.*;

@Controller
@Service("customersViewService")
public class CustomersViewServiceImpl implements CustomersViewService {

	@Autowired
	private CustomersViewRepository customersViewRepository;

	// private final Map<Integer, CustomersView> customersView = new TreeMap<>();


	/*
	 * public CustomersViewServiceImpl() {
	 * 
	 * customers.put(1, new Customer(1, "Monica", "Hockelberg",
	 * "mhockelb@redhat.com")); customers.put(2, new Customer(2, "John", "Doe",
	 * "jdoe@gmail.com")); customers.put(3, new Customer(3, "Jane", "Smith",
	 * "jsmith@gmail.com"));
	 * 
	 * }
	 */

	
	/*
	 * @Override public Optional<CustomersView> findCustomersViews(Integer id) {
	 * System.out.println("1- HERE'S THE ID=" + id); return
	 * customersViewRepository.findById(id); }
	 */
	  
	/*
	 * @Override public CustomersView findCustomersViews(Integer id) {
	 * System.out.println("1- HERE'S THE ID=" + id); return
	 * customersViewRepository.findOne(id); }
	 */
	 

	@Override
	public Iterable<CustomersView> findCustomersViews() {
		return customersViewRepository.findAll();
	}
	
	
}
