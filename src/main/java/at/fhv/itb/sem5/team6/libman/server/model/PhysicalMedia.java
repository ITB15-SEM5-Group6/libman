package at.fhv.itb.sem5.team6.libman.server.model;

import org.springframework.data.annotation.Id;

public class PhysicalMedia {

    @Id
    private String id;
    private Availability availability;
    private Media info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Media getInfo() {
        return info;
    }

    public void setInfo(Media info) {
        this.info = info;
    }
}
