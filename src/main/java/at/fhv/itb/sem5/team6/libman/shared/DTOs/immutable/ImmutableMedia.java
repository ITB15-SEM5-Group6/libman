package at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;

import java.util.Date;

public interface ImmutableMedia {
    String getTitle();
    MediaType getType();
    String getIsbn();
    String getAuthor();
    String getPublisher();
    String getTags();
    String getGenre();
    Date getReleaseDate();
}
