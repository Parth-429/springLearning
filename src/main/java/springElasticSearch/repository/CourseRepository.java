package springElasticSearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import springElasticSearch.entity.Course;

@Repository
public interface CourseRepository extends ElasticsearchRepository<Course,Long> {

}
