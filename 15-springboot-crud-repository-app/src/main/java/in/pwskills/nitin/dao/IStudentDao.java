package in.pwskills.nitin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.pwskills.nitin.entity.Student;

@Repository
public interface IStudentDao extends CrudRepository<Student, Integer> {

}
