package at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;

public interface ImmutablePhysicalMedia {
    Availability getAvailability();
    String getIndex();
    ImmutableMedia getMedia();
}
