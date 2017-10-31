package at.fhv.itb.sem5.team6.libman.persistence;

import at.fhv.itb.sem5.team6.libman.model.Media;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MediaRepository extends MongoRepository<Media, String> {

}
