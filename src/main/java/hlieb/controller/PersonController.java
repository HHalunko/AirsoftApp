package hlieb.controller;

import hlieb.model.Person;
import hlieb.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
	@Autowired
	@Qualifier("personService")
	private PersonService service;

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		Person person = new Person();
		model.addAttribute("person",person);
		model.addAttribute("persons",service.getAllPersons());
		return "persons";
	}
	@RequestMapping(value = "/persons/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute ("person") Person p) {
		service.savePerson(p);
		return "redirect:/persons";
	}
}
