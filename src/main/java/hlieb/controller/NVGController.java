package hlieb.controller;

import hlieb.model.gear.NVG;
import hlieb.service.NVGService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NVGController {

	@Autowired
	@Qualifier("nvgService")
	private NVGService service;

	@RequestMapping(value = "/nvgs", method = RequestMethod.GET)
	public String listNVGs(Model model) {
		NVG nvg = new NVG();
		model.addAttribute("nvg",nvg);
		model.addAttribute("nvg",service.getAllNVGs());
		return "nvgs";
	}
	@RequestMapping(value = "/nvgs/add", method = RequestMethod.POST)
	public String addNVG(@ModelAttribute ("nvg") NVG nvg) {
		service.saveNVG(nvg);
		return "redirect:/nvgs";
	}

}
