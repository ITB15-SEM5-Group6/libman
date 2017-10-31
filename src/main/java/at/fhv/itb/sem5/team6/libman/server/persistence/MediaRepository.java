package at.fhv.itb.sem5.team6.libman.server.persistence;

import at.fhv.itb.sem5.team6.libman.server.model.Media;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MediaRepository extends MongoRepository<Media, String> {
}
