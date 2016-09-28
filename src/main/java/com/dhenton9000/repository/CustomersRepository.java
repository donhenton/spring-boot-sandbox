 
package com.dhenton9000.repository;

 

 

import com.dhenton9000.domain.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends CrudRepository<Customers,Long>{
}