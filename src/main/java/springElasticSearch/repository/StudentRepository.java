package springElasticSearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import springElasticSearch.entity.Student;

@Repository
public interface StudentRepository extends ElasticsearchRepository<Student, Long> {

}
