package oopKodlamaIoHomePage.dataAccess;

import oopKodlamaIoHomePage.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName()+" "+"eğitmen olarak JDBC ile veritabanına eklendi.");
		
	}

}
