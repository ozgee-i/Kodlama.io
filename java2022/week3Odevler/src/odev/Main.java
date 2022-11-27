package odev;

import odev.business.CategoryManager;
import odev.business.CourseManager;
import odev.business.InstructorManager;
import odev.core.logging.DatabaseLogger;
import odev.core.logging.FileLogger;
import odev.core.logging.MailLogger;
import odev.core.logging.logger;
import odev.dataAccess.HibernateCourseDao;
import odev.dataAccess.HibernateInstructorDao;
import odev.dataAccess.JdbcCategoryDao;
import odev.entities.Category;
import odev.entities.Course;
import odev.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
    logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
/*		//Category
		
		Category category1 = new Category(0,"Java");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);

*/		
		//Course
/*		
		Course course = new Course(6, "c#",0);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
*/			

		//Instructor
		
/*		InstructorManager instructorManager = new InstructorManager( new HibernateInstructorDao(), loggers);
		Instructor instructor = new Instructor(2,"engin", "demiroğ");
		instructorManager.add(instructor);
*/
	}

}
