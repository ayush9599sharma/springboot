package in.pwskills.nitin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import in.pwskills.nitin.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
	
}
