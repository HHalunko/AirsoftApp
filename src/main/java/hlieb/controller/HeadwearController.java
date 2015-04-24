package hlieb.controller;

import hlieb.model.gear.Headwear;
import hlieb.service.HeadwearService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeadwearController {

	@Autowired
	@Qualifier("headwearService")
	private HeadwearService service;

	@RequestMapping(value = "/allheadwear", method = RequestMethod.GET)
	public String listHeadwears(Model model) {
		Headwear headwear = new Headwear();
		model.addAttribute("headwear",headwear);
		model.addAttribute("allheadwear",service.getAllHeadwear());
		return "allheadwear";
	}
	@RequestMapping(value = "/allheadwear/add", method = RequestMethod.POST)
	public String addHeadwear(@ModelAttribute ("headwear") Headwear h) {
		service.saveHeadwear(h);
		return "redirect:/allheadwear";
	}

}
