package oopKodlamaIoHomePage.business;

import oopKodlamaIoHomePage.dataAccess.InstructorDao;
import oopKodlamaIoHomePage.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;

	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}

	public void add(Instructor instructor) {

		instructorDao.add(instructor);

	}

}
