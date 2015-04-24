package hlieb.controller;

import hlieb.model.gear.KneePads;
import hlieb.service.KneePadsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KneePadsController {

	@Autowired
	@Qualifier("kneepadsService")
	private KneePadsService service;

	@RequestMapping(value = "/allkneepads", method = RequestMethod.GET)
	public String listAllKneePads(Model model) {
		KneePads kneepads = new KneePads();
		model.addAttribute("kneepads",kneepads);
		model.addAttribute("allkneepads",service.getAllKneePads());
		return "allkneepads";
	}
	@RequestMapping(value = "/allkneepands/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute ("kneepads") KneePads kp) {
		service.saveKneePads(kp);
		return "redirect:/allkneepands";
	}

}
