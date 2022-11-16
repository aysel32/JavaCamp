package oopKodlamaIoHomePage.business;

import oopKodlamaIoHomePage.core.logging.Logger;
import oopKodlamaIoHomePage.dataAccess.CourseDao;
import oopKodlamaIoHomePage.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception(course.getCoursePrice()+ " "+"Kurs ücreti 0 dan küçük olamaz");
		}

		if (course.getCourseName().equals(course.getCourseName())) {
			throw new Exception(course.getCourseName() + " " + "Kursu zaten kayıtlı. Kurs adı tekrar edemez");

		}

		// JdbcCourseDao courseDao = new JdbcCourseDao();
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());

		}

	}

}
