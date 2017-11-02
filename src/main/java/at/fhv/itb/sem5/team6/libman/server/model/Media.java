package at.fhv.itb.sem5.team6.libman.server.model;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable.MutableMedia;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter

@Document
public class Media implements MutableMedia, Identifyable<String> {
    @Id
    private String id;
    private String title;
    private MediaType type;
}
