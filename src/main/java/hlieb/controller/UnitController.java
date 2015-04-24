package hlieb.controller;

import hlieb.model.Unit;
import hlieb.service.UnitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UnitController {
	@Autowired
	@Qualifier("unitService")
	private UnitService service;

	@RequestMapping(value = "/units", method = RequestMethod.GET)
	public String listUnits(Model model) {
		Unit unit = new Unit();
		model.addAttribute("unit", unit);
		model.addAttribute("unit", service.getAllUnits());
		return "units";
	}
	@RequestMapping(value = "/units/add", method = RequestMethod.POST)
	public String addUnit(@ModelAttribute ("unit") Unit u) {
		service.saveUnit(u);
		return "redirect:/units";
	}

}
