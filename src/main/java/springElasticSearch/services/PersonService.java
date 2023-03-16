package springElasticSearch.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import springElasticSearch.entity.Person;
import springElasticSearch.repository.PersonRepository;

@Data
@Service
public class PersonService {
    private PersonRepository personRepository;
    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public void savePerson(Person person){
        this.personRepository.save(person);
    }
}
