package at.fhv.itb.sem5.team6.libman.server.model;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable.MutableCustomer;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

//Lombok annotations to reduce boilerplate (lombok plugin has to be installed in IDE)
@Data // applies lombok-annotations
@Getter // enables getters
@Setter // enables setters
@AllArgsConstructor // creates a constructor accepting all args in the order the attributes are defined
@NoArgsConstructor // creates an empty constructor

//MongoDb annnotation
@Document
public class Customer implements MutableCustomer, Serializable{
    @Id
    private String id;

    private String firstName;
    private String lastName;
}
