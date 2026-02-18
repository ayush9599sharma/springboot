package in.pwskills.nitin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.pwskills.nitin.beans.Student;

@Repository("dao")
@Transactional
public class StudentRepoImpl implements IStudentRepo {
	
	@Autowired
	private HibernateTemplate template;
	
	@Override
	public String saveStudent(Student student) {
		System.out.println(template);
		Integer id = (int)template.save(student);
		return "Object saved with the id :: "+ id;
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudents() {
		return template.loadAll(Student.class);
	}
	
	

}
