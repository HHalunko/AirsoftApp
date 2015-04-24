package hlieb.controller;

import hlieb.model.gear.HelmetCover;
import hlieb.service.HelmetCoverService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelmetCoverController {

	@Autowired
	@Qualifier("helmetcoverService")
	private HelmetCoverService service;

	@RequestMapping(value = "/helmetcovers", method = RequestMethod.GET)
	public String listHelmetCovers(Model model) {
		HelmetCover helmetcover = new HelmetCover();
		model.addAttribute("helmetcover", helmetcover);
		model.addAttribute("helmetcovers", service.getAllHelmetCovers());
		return "helmetcovers";
	}

	@RequestMapping(value = "/helmetcovers/add", method = RequestMethod.POST)
	public String addHelmetCover(@ModelAttribute("helmetcover") HelmetCover hc) {
		service.saveHelmetCover(hc);
		return "redirect:/helmetcovers";
	}

}
