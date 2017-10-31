package at.fhv.itb.sem5.team6.libman.persistence;

import at.fhv.itb.sem5.team6.libman.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByLastName(String name);
}
