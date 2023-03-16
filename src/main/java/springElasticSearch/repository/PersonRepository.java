package springElasticSearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import springElasticSearch.entity.Person;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, Long> {

}
