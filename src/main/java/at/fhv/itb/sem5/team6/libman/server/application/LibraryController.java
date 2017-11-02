package at.fhv.itb.sem5.team6.libman.server.application;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;
import at.fhv.itb.sem5.team6.libman.server.persistence.CustomerRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.MediaRepository;
import at.fhv.itb.sem5.team6.libman.server.persistence.ReservationRepository;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;
import org.springframework.beans.factory.annotation.Autowired;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class LibraryController implements Convertible {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private ReservationRepository reservationRepository;

    public List<ImmutableMedia> findAllMedia() {
        return castUp(mediaRepository.findAll());
    }

    public List<ImmutableMedia> findAllMedia(String text) {
        List<Media> result;
        try {
            MediaType type = MediaType.valueOf(text);
            result = mediaRepository.findDistinctByIdLikeOrTitleLikeOrTypeLikeAllIgnoreCase(text, text, type);
        } catch (IllegalArgumentException e) {
            result = mediaRepository.findDistinctByIdLikeOrTitleLikeAllIgnoreCase(text, text);
        }
        return castUp(result);
    }

    public List<ImmutableMedia> findAllMedia(MediaType type) {
        return castUp(mediaRepository.findDistinctByTypeEquals(type));
    }

    public List<ImmutableMedia> findAllMedia(Availability availability) {
        throw new NotImplementedException();
    }

    public List<ImmutableMedia> findAllMedia(String text, MediaType type, Availability availability) {
        throw new NotImplementedException();
    }
}
