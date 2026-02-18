package in.pwskills.nitin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pwskills.nitin.beans.Student;
import in.pwskills.nitin.config.AppConfig;
import in.pwskills.nitin.dao.IStudentRepo;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		IStudentRepo repo = context.getBean(IStudentRepo.class);
		
//		Student std = new Student();
//		std.setSname("Nikhil");
//		std.setSage(24);
//		std.setSaddress("kheriki");
//		repo.saveStudent(std);
		
		repo.findAllStudents().forEach(System.out::println);;
		context.close();

	}

}
