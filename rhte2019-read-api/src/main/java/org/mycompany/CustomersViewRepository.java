package org.mycompany;

import org.springframework.data.repository.CrudRepository;


import org.mycompany.CustomersView;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomersViewRepository extends CrudRepository<CustomersView, Integer> {

}