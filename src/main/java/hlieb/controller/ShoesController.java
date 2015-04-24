package hlieb.controller;

import hlieb.model.gear.Shoes;
import hlieb.service.ShoesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShoesController {

	@Autowired
	@Qualifier("shoesService")
	private ShoesService service;

	@RequestMapping(value = "/allshoes", method = RequestMethod.GET)
	public String listAllShoes(Model model) {
		Shoes shoes = new Shoes();
		model.addAttribute("shoes",shoes);
		model.addAttribute("allshoes",service.getAllShoes());
		return "allshoes";
	}
	@RequestMapping(value = "/allshoes/add", method = RequestMethod.POST)
	public String addShoes(@ModelAttribute ("shoes") Shoes s) {
		service.saveShoes(s);
		return "redirect:/allshoes";
	}

}
