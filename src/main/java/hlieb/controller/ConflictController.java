package hlieb.controller;

import hlieb.model.Conflict;
import hlieb.service.ConflictService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConflictController {

	@Autowired
	@Qualifier("conflictService")
	private ConflictService service;

	@RequestMapping(value = "/conflicts", method = RequestMethod.GET)
	public String listConflicts(Model model) {
		Conflict conflict = new Conflict();
		model.addAttribute("conflict", conflict);
		model.addAttribute("conflict", service.getAllConflicts());
		return "conflicts";
	}
	@RequestMapping(value = "/conflicts/add", method = RequestMethod.POST)
	public String addConflict(@ModelAttribute ("conflicts") Conflict c) {
		service.saveConflict(c);
		return "redirect:/conflicts";
	}

}
