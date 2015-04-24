package hlieb.service;

import hlieb.model.Person;

public interface PersonService {

	public void savePerson(Person person);
	public Person getPerson(Integer id);
	public Iterable<Person> getAllPersons();
	public void deletePerson(Integer id);
	Person editPerson(Integer id, Person person);

}
