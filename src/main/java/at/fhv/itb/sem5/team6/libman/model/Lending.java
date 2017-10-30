package at.fhv.itb.sem5.team6.libman.model;

import org.springframework.data.annotation.Id;

public class Lending {

    @Id
    private String id;
    private PhysicalMedia physicalMedia;
    private Customer customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PhysicalMedia getPhysicalMedia() {
        return physicalMedia;
    }

    public void setPhysicalMedia(PhysicalMedia physicalMedia) {
        this.physicalMedia = physicalMedia;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
