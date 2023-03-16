package getServiceObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

public class ObjectGetter {
    public static BookService getBook(){
        ApplicationContext context = new AnnotationConfigApplicationContext("getServiceObject");
        BookService bookService = context.getBean("service", BookService.class);
        return bookService;
    }
}
