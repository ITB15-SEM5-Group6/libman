package at.fhv.itb.sem5.team6.libman.server.service;

import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByLastNameLike(@Param("name") String name);
}