package odev.dataAccess;

import odev.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına kurs eklendi");		
	}

}
