package hlieb.controller;

import hlieb.model.Camo;
import hlieb.service.CamoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CamoController {
	@Autowired
	@Qualifier("camoService")
	private CamoService service;

	@RequestMapping(value = "/camos", method = RequestMethod.GET)
	public String listCamos(Model model) {
		Camo camo = new Camo();
		model.addAttribute("camo", camo);
		model.addAttribute("Ccamo", service.getAllCamos());
		return "camos";
	}
	@RequestMapping(value = "/camos/add", method = RequestMethod.POST)
	public String addCamo(@ModelAttribute ("camo") Camo c) {
		service.saveCamo(c);
		return "redirect:/camos";
	}

}
