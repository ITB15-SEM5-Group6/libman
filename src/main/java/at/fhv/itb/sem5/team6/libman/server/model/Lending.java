package at.fhv.itb.sem5.team6.libman.server.model;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableCustomer;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutablePhysicalMedia;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable.MutableLending;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter

@Document
public class Lending implements MutableLending, Identifyable<String> {

    @Id
    private String id;
    private PhysicalMedia physicalMedia;
    private Customer customer;

    @Override
    public void setPhysicalMedia(ImmutablePhysicalMedia physicalMedia) {
        this.physicalMedia = (PhysicalMedia) physicalMedia;
    }

    @Override
    public void setCustomer(ImmutableCustomer customer) {
        this.customer = (Customer) customer;
    }
}
