package in.pwskills.nitin.runner;

import java.rmi.StubNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IStudentDao;

@Component
public class StudentDeleteRunner implements CommandLineRunner {
 
	@Autowired
	private IStudentDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		//dao.deleteById(10);
		dao.delete(dao.findById(100).orElseThrow(() -> new StubNotFoundException("Not found")));

	}

}
