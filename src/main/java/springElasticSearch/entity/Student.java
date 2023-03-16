package springElasticSearch.entity;

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
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Document(indexName = "student")
public class Student extends Person {
    private String contactNo;
    @Field(type = FieldType.Nested, includeInParent = false)
    private List<Course> coursesEnrolled;

    public Student(Long personId, String name, String contactNo, List<Course> coursesEnrolled) {
        super(personId, name);
        this.contactNo = contactNo;
        this.coursesEnrolled = coursesEnrolled;
    }
}