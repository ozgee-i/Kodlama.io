package odev.business;

import odev.core.logging.logger;
import odev.dataAccess.ICourseDao;

import odev.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private logger[] loggers;
	
	public CourseManager(ICourseDao courseDao, logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if (course.getCourseName().equals(course.getCourseName())) {
			throw new Exception("Bu kurs zaten sistemde kayıtlıdır.");
		}
		
		if(course.getCoursePrice()<0) {
			throw new Exception("kurs fiyatı 0'dan küçük olamaz");
		}
		courseDao.add(course);
	}

}
