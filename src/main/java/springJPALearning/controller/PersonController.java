package springJPALearning.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springJPALearning.entities.Person;
import springJPALearning.repository.PersonRepository;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Controller
public class PersonController {
    @Autowired
    public PersonRepository personRepository;
    public void savePerson(Person person){
            this.personRepository.save(person);
    }
}
