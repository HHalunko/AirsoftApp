package hlieb.controller;

import hlieb.model.gear.HeadGear;
import hlieb.service.HeadGearService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeadGearController {

	@Autowired
	@Qualifier("headGearService")
	private HeadGearService service;

	@RequestMapping(value = "/headgearall", method = RequestMethod.GET)
	public String listHeadGearAll(Model model) {
		HeadGear headGear = new HeadGear();
		model.addAttribute("headgear", headGear);
		model.addAttribute("headgearall", service.getAllHeadGear());
		return "headgearall";
	}

	@RequestMapping(value = "/headgearall/add", method = RequestMethod.POST)
	public String addHeadGear(@ModelAttribute("headgear") HeadGear hg) {
		service.saveHeadGear(hg);
		return "redirect:/headgearall";
	}

}
