package sm.DAO;

import java.util.List;

import sm.api.Student;

public interface StudentDAO {
	
	
	List <Student>loadStudents();
	
	void saveStudent(Student student);

}
