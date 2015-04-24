package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.PersonDAO;
import hlieb.model.Person;
import hlieb.service.PersonService;

public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO dao;

	@Override
	@Transactional
	public void savePerson(Person person) {
		dao.save(person);
	}

	@Override
	public Person getPerson(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Person> getAllPersons() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Person editPerson(Integer id, Person person) {
		Person newPerson = dao.findOne(id);
		newPerson.setFirstName(person.getFirstName());
		return dao.save(newPerson);
	}

	@Override
	@Transactional
	public void deletePerson(Integer id) {
		dao.delete(id);
	}

}
