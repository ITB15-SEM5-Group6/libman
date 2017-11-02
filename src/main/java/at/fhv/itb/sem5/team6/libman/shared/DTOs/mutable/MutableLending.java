package at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableCustomer;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableLending;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutablePhysicalMedia;

public interface MutableLending extends ImmutableLending {
    void setPhysicalMedia(ImmutablePhysicalMedia physicalMedia);

    void setCustomer(ImmutableCustomer customer);
}
