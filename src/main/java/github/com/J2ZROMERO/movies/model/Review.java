package github.com.J2ZROMERO.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

public Review(String body){
    this.body = body;
}

    private ObjectId id;
    private String body;
    private List<Review> reviewIds;
}
