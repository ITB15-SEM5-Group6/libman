package at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutablePhysicalMedia;

public interface MutablePhysicalMedia extends ImmutablePhysicalMedia {
    void setAvailability(Availability availability);

    void setMedia(ImmutableMedia media);
}
