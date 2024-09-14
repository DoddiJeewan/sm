package sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sm.api.Student;
import sm.RowMApper.StudentRowMapper;


@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Student> loadStudents() {
		
	
		String sql ="SELECT * FROM students";
		
	   List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		
		
		return theListOfStudent;
	}


	@Override
	public void saveStudent(Student student) {
		Object [] sqlParameters = {student.getName(),student.getMobile(),student.getCountry()};
		
		String sql = "insert into students(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql,sqlParameters);
		
		System.out.println("1 record saved");
		
		
	}
	
	

}
