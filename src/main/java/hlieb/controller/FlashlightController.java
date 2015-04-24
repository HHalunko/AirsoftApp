package hlieb.controller;

import hlieb.model.gear.Flashlight;
import hlieb.service.FlashlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlashlightController {

	@Autowired
	@Qualifier("fashlightService")
	private FlashlightService service;

	@RequestMapping(value = "/flashlights", method = RequestMethod.GET)
	public String listFlashlights(Model model) {
		Flashlight flashlight = new Flashlight();
		model.addAttribute("flashlight",flashlight);
		model.addAttribute("flashlights",service.getAllFlashlights());
		return "flashlights";
	}
	@RequestMapping(value = "/flashlights/add", method = RequestMethod.POST)
	public String addFlashlight(@ModelAttribute ("flashlight") Flashlight f) {
		service.saveFlashlight(f);
		return "redirect:/flashlights";
	}

}
