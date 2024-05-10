package github.com.J2ZROMERO.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "usuarios") // representara la collection
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    @Id
    private ObjectId id;
    private String name;
    private String email;
}
