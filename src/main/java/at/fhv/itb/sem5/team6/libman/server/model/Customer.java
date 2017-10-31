package at.fhv.itb.sem5.team6.libman.server.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer implements Serializable{
    @Id
    private String id;

    private String firstName;
    private String lastName;
}
