package at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;

public interface ImmutableMedia {
    String getTitle();
    MediaType getType();
    Availability getAvailability();
}
