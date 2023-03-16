package springJDBCLearning.studentDao;

import springJDBCLearning.student.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public Student showStudentDetail(int studentId);
    public List<Student> showStudents();
    public int delete(int studentID);
}
