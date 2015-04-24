package hlieb.controller;

import hlieb.model.gear.IRMarker;
import hlieb.service.IRMarkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IRMarkerController {

	@Autowired
	@Qualifier("irmarkerService")
	private IRMarkerService service;

	@RequestMapping(value = "/irmarkers", method = RequestMethod.GET)
	public String listIRMarkers(Model model) {
		IRMarker irmarker = new IRMarker();
		model.addAttribute("irmarker",irmarker);
		model.addAttribute("irmarkers",service.getAllIRMarkers());
		return "irmarkers";
	}
	@RequestMapping(value = "/irmarkers/add", method = RequestMethod.POST)
	public String addIRMarker(@ModelAttribute ("irmarker") IRMarker irm) {
		service.saveIRMarker(irm);
		return "redirect:/irmarkers";
	}

}
