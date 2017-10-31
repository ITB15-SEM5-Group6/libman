package at.fhv.itb.sem5.team6.libman.persistence;

import at.fhv.itb.sem5.team6.libman.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    List<Reservation> findByCustomer_LastNameLike(String name);

    List<Reservation> findByInfo_TitleLike(String title);
}
