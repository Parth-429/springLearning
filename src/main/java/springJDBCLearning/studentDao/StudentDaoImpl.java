package springJDBCLearning.studentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import springJDBCLearning.student.Student;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements  StudentDao{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public StudentDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
        String query = "CREATE TABLE IF NOT EXISTS Student (\n" +
                "  id INT,\n" +
                "  name VARCHAR(100),\n" +
                "  contact VARCHAR(100)\n" +
                ");";
        this.jdbcTemplate.execute(query);
    }
    @Override
    public int insert(Student student) {
        String query = "insert into Student(id,name,contact) values(?,?,?)";
        return this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getContactNo());
    }

    @Override
    public Student showStudentDetail(int studentId) {
        String query = "select * from Student where id = ?";
        return (Student)this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), studentId);
    }

    @Override
    public List<Student> showStudents() {
        String query = "select * from Student";
        return this.jdbcTemplate.query(query, new RowMapperImpl());
    }

    @Override
    public int delete(int studentID) {
        String query = "delete from student where id = ?";
        return this.jdbcTemplate.update(query, studentID);
    }
}
