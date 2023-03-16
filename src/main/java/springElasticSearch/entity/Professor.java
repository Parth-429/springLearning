package springElasticSearch.entity;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Document(indexName = "professor")
public class Professor extends Person {
//    @Field(type = FieldType.Nested, includeInParent = true)
//    private List<Course> coursesTaken;

    public Professor(Long personId, String name) {
        super(personId, name);
    }
}
