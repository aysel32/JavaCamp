package oopKodlamaIoHomePage.dataAccess;

import oopKodlamaIoHomePage.entities.Course;

public class HibernateCourseDao implements CourseDao{	
		public void add(Course course) {
			System.out.println(course.getCourseName()+" "+"Kursu Hibernate ile veritabanına eklendi");
		}

}

