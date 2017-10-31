package at.fhv.itb.sem5.team6.libman.server.application;

import at.fhv.itb.sem5.team6.libman.server.persistence.CustomerRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.MediaRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationRestController {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MediaRepository mediaRepository;


}
