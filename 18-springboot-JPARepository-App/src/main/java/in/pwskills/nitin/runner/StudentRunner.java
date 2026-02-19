package in.pwskills.nitin.runner;



import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IStudentRepository;
import in.pwskills.nitin.entity.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private IStudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
//		repo.saveAll(
//				Arrays.asList(
//						new Student("Sachin" , 300.0 , LocalDateTime.now()),
//						new Student("Virat" , 400.0 , LocalDateTime.now()),
//						new Student("Dhoni" , 800.0 , LocalDateTime.now()),
//						new Student("Yuvraj" , 600.0 , LocalDateTime.now()),
//						new Student("Bhadu" , 900.0 , LocalDateTime.now())		
//						)
//				);
//		
		
		
		
//		List<Student> list = repo.findAll();
//		System.out.println(list.getClass().getName());
//		list.forEach(System.out::println);
//		
//		repo.findById(1).ifPresentOrElse(System.out::println, ()->{System.out.println("No record");});
		
		Student std = new Student();
		std.setStdName("Sachin");
		repo.findAll(Example.of(std)).forEach(System.out::println);
	}

}
