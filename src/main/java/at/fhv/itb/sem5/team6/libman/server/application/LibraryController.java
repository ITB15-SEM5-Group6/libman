package at.fhv.itb.sem5.team6.libman.server.application;

import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.persistence.CustomerRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.MediaRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.ReservationRepository;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.MediaDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibraryController implements IConvertable<Media, MediaDTO> {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Media> findAllMedia() {
        return mediaRepository.findAll();
    }

    @Override
    public Media convertDTO(MediaDTO item) {
        return null;
    }

    @Override
    public MediaDTO convertModel(Media item) {
        return null;
    }
}
