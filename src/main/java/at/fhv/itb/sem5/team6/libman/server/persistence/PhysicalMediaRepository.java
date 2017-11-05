package at.fhv.itb.sem5.team6.libman.server.persistence;

import at.fhv.itb.sem5.team6.libman.server.model.PhysicalMedia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhysicalMediaRepository extends MongoRepository<PhysicalMedia, String> {



}
