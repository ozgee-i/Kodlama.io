package odev.business;

import odev.core.logging.logger;
import odev.dataAccess.IInstructor;
import odev.entities.Instructor;

public class InstructorManager {

	private IInstructor instructor;
	private logger[] loggers;
	
	public InstructorManager(IInstructor instructor, logger[] loggers) {
		this.instructor = instructor;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception {
		Instructor[] instructors = this.instructor.getAll();
		this.instructor.add(instructor);

		for (logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
		}
	}
}

