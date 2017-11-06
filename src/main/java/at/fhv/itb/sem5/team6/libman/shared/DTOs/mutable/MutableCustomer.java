package at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableCustomer;

public interface MutableCustomer extends ImmutableCustomer {
    void setFirstName(String firstName);

    void setLastName(String lastName);
}
