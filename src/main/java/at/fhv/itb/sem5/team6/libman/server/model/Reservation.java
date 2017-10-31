package at.fhv.itb.sem5.team6.libman.server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reservation {

    @Id
    private String id;
    private Media info;
    private Customer customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Media getInfo() {
        return info;
    }

    public void setInfo(Media info) {
        this.info = info;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
