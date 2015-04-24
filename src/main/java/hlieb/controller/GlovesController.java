package hlieb.controller;

import hlieb.model.gear.Gloves;
import hlieb.service.GlovesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GlovesController {

	@Autowired
	@Qualifier("glovesService")
	private GlovesService service;

	@RequestMapping(value = "/allgloves", method = RequestMethod.GET)
	public String listAllGloves(Model model) {
		Gloves gloves = new Gloves();
		model.addAttribute("gloves",gloves);
		model.addAttribute("allgloves",service.getAllGloves());
		return "allgloves";
	}
	@RequestMapping(value = "/allgloves/add", method = RequestMethod.POST)
	public String addGloves(@ModelAttribute ("gloves") Gloves g) {
		service.saveGloves(g);
		return "redirect:/allgloves";
	}

}
