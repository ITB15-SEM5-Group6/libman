package at.fhv.itb.sem5.team6.libman.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

//Lombok annotations to reduce boilerplate (lombok plugin has to be installed in IDE)
@Data // applies lombok-annotations
@Getter // enables getters
@Setter // enables setters
@AllArgsConstructor // creates a constructor accepting all args in the order the attributes are defined
@NoArgsConstructor // creates an empty constructor

//MongoDb annnotation
@Document
public class Reservation {

    @Id
    private String id;
    @DBRef //MongoDb uses this object as a reference
    private Media info;
    @DBRef //MongoDb uses this object as a reference
    private Customer customer;
}
