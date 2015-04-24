package hlieb.controller;

import hlieb.model.gear.Glasses;
import hlieb.service.GlassesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GlassesController {

	@Autowired
	@Qualifier("glassesService")
	private GlassesService service;

	@RequestMapping(value = "/allglasses", method = RequestMethod.GET)
	public String listAllGlasses(Model model) {
		Glasses glasses = new Glasses();
		model.addAttribute("glasses",glasses);
		model.addAttribute("allglasses",service.getAllGlasses());
		return "allglasses";
	}
	@RequestMapping(value = "/allglasses/add", method = RequestMethod.POST)
	public String addGlasses(@ModelAttribute ("glasses") Glasses g) {
		service.saveGlasses(g);
		return "redirect:/allglasses";
	}

}
