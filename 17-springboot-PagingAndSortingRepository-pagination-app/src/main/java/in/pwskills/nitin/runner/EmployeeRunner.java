package in.pwskills.nitin.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import in.pwskills.nitin.dao.IEmployeeRepository;
import in.pwskills.nitin.entity.Employee;

//@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
			repo.saveAll(

					Arrays.asList(
							new Employee(10,"AAB",200.0,"DEV"),
							new Employee(11,"AAB",200.0,"QA"),
							new Employee(12,"AAB",200.0,"DEV"),
							new Employee(13,"AAB",300.0,"DEV"),
							new Employee(14,"AAB",270.0,"QA"),
							new Employee(15,"AAB",280.0,"DEV"),
							new Employee(16,"AAB",680.0,"BA"),
							new Employee(17,"AAB",890.0,"DEV"),
							new Employee(18,"AAB",290.0,"QA"),
							new Employee(19,"AAB",600.0,"DEV")
							)
					
					);       
	}

}
