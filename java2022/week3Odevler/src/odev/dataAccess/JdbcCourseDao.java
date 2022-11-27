package odev.dataAccess;

import odev.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veri tabanına kurs eklendi");
		
	}

}
