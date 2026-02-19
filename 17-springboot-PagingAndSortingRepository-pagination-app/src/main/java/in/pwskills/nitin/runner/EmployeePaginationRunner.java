package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IEmployeePagingAndSortingRepository;
import in.pwskills.nitin.entity.Employee;

@Component
public class EmployeePaginationRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeePagingAndSortingRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.findAll(PageRequest.of(0, 4)).forEach(System.out::println);
		repo.findAll(PageRequest.of(1, 2)).forEach(System.out::println);
		repo.findAll(PageRequest.of(2, 4)).forEach(System.out::println);
		
		Page<Employee> page = repo.findAll(PageRequest.of(0, 4));
		System.out.println(page.getSize());
		System.out.println(page.getTotalPages());
		
		
		
		
	}

}
