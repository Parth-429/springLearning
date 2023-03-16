package springJDBCLearning;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springJDBCLearning.student.Student;
import springJDBCLearning.studentDao.StudentDao;

@SpringBootApplication
public class SpringJDBC {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("springJDBCLearning.config");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        System.out.println(studentDao.delete(25));
        studentDao.insert(new Student(25,"parth","1234567890"));
        System.out.println(studentDao.showStudentDetail(25));
    }
}
