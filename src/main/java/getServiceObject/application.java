package getServiceObject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Service;


public class application {
    public static void main(String[] args) {
        //ApplicationContext context = SpringApplication.run(application.class,args);
        BookService bookService = ObjectGetter.getBook();
        bookService.addBook();
    }
}
