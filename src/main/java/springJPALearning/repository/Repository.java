package springJPALearning.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

public class Repository {
    public static CourseRepository getRepository(String repo){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("springJPALearning.repository");
        if(repo.equals("Mongo"))
            return context.getBean(CourceMongo.class);
        else
            return context.getBean(CourseJpa.class);
    }
}
