package oopKodlamaIoHomePage.dataAccess;

import oopKodlamaIoHomePage.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println(course.getCourseName()+" "+"Kursu Jdcb ile veritabanına eklendi");
	}

}
