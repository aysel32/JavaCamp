package oopKodlamaIoHomePage;

import oopKodlamaIoHomePage.business.CategoryManager;
import oopKodlamaIoHomePage.business.CourseManager;
import oopKodlamaIoHomePage.business.InstructorManager;
import oopKodlamaIoHomePage.core.logging.DatabaseLogger;
import oopKodlamaIoHomePage.core.logging.FileLogger;
import oopKodlamaIoHomePage.core.logging.Logger;
import oopKodlamaIoHomePage.dataAccess.HibernateCourseDao;
import oopKodlamaIoHomePage.dataAccess.HibernateInstructorDao;
import oopKodlamaIoHomePage.dataAccess.JdbcCategoryDao;
import oopKodlamaIoHomePage.dataAccess.JdbcCourseDao;
import oopKodlamaIoHomePage.dataAccess.JdbcInstructorDao;
import oopKodlamaIoHomePage.entities.Category;
import oopKodlamaIoHomePage.entities.Course;
import oopKodlamaIoHomePage.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };
		
		Instructor instructor = new Instructor(1,"Engin","Demiroğ","Java");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao());
		instructorManager.add(instructor);
		
		Course course = new Course(1, "Java", 200);		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);

		Category category = new Category(1, "Programlama");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		
	

	}

}
