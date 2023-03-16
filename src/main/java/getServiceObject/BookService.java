package getServiceObject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "service")
public class BookService {
    public void addBook(){
        System.out.println("Book is Successfully added");
    }
}
