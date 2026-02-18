package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IStudentDao;
import in.pwskills.nitin.entity.Student;
import in.pwskills.nitin.exception.StudentRecordNotFoundException;

//@Component
public class StudentRunner implements CommandLineRunner {
	
	@Autowired
	private IStudentDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(dao.getClass().getName());
		dao.save(new Student(10,"Ayush","Baghpat",26));
//		Student s1 = new Student(7,"Dhoni","Ranchi",50);
//		Student s2 = new Student(10,"Sachin","Mumbai",53);
//		Student s3 = new Student(18,"Chokli","Delhi",39);
//		dao.saveAll(List.of(s1,s2,s3));
		
//		Optional<Student> std = dao.findById(7);
//		if(std.isEmpty()) {
//			System.out.println("Record not found for the given Id ");
//		}else {
//			
//			System.out.println(std.get());
//		}
		
		Student std = dao.findById(90).orElseThrow(()-> new StudentRecordNotFoundException("Record not found"));
		System.out.println(std);
		
		
	}

}
