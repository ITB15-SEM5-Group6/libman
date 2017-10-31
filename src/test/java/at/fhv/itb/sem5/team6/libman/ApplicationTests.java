package at.fhv.itb.sem5.team6.libman;

import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.Reservation;
import at.fhv.itb.sem5.team6.libman.server.persistence.CustomerRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.MediaRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ReservationRepository reservations;

    @Autowired
    private CustomerRepository customers;

    @Autowired
    private MediaRepository medias;

	@Test
	public void contextLoads() {
        Customer customer = customers.findByLastName("Dengg").get(0);
        Media media = medias.findAll().stream().filter(media1 -> media1.getTitle().contains("Feuerkelch")).collect(Collectors.toList()).get(0);

        Reservation reservation = new Reservation();
        reservations.save(reservation);
    }

}
