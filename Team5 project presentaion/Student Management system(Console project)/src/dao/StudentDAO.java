package dao;
import java.util.List;
import model.Student;
public interface StudentDAO {
	public abstract void createStudent(Student student);
	public abstract Student getStudentById(int admissionNo);
	public abstract void updateStudent(Student student,int admno);
	public abstract void deleteStudentById(int admissionNo);
	public abstract List<Student> getAllStudentsInfo();
}
