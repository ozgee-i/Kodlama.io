package odev.dataAccess;

import odev.entities.Instructor;

public class HibernateInstructorDao implements IInstructor {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veri tabanına eklendi: ");
				
	}

	@Override
	public Instructor[] getAll() {
		Instructor[] instructors = new Instructor[] {new Instructor(1, "Özge", "İrhan")};
		return instructors;
	
	}

}
