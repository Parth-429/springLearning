package springElasticSearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import springElasticSearch.entity.Professor;

@Repository
public interface ProfessorRepository extends ElasticsearchRepository<Professor, Long> {

}
