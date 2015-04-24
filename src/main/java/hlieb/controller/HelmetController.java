package hlieb.controller;

import hlieb.model.gear.Helmet;
import hlieb.service.HelmetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelmetController {

	@Autowired
	@Qualifier("helmetService")
	private HelmetService service;

	@RequestMapping(value = "/helmets", method = RequestMethod.GET)
	public String listHelmets(Model model) {
		Helmet helmet = new Helmet();
		model.addAttribute("helmet",helmet);
		model.addAttribute("helmets",service.getAllHelmets());
		return "helmets";
	}
	@RequestMapping(value = "/helmets/add", method = RequestMethod.POST)
	public String addHelmet(@ModelAttribute ("helmet") Helmet h) {
		service.saveHelmet(h);
		return "redirect:/helmets";
	}

}
