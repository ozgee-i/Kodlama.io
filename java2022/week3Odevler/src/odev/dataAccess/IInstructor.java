package odev.dataAccess;

import odev.entities.Instructor;

public interface IInstructor {
	public void add(Instructor instructor);
	public Instructor[] getAll();
}
