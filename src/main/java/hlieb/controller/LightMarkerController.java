package hlieb.controller;

import hlieb.model.gear.LightMarker;
import hlieb.service.LightMarkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LightMarkerController {

	@Autowired
	@Qualifier("lightmarkerService")
	private LightMarkerService service;

	@RequestMapping(value = "/lightmarkers", method = RequestMethod.GET)
	public String listLightMarkers(Model model) {
		LightMarker lightmarker = new LightMarker();
		model.addAttribute("lightmarker", lightmarker);
		model.addAttribute("leghtmarker", service.getAllLightMarkers());
		return "lightmarkers";
	}

	@RequestMapping(value = "/lightmarkers/add", method = RequestMethod.POST)
	public String addLightMarker(@ModelAttribute("lightmarker") LightMarker lm) {
		service.saveLightMarker(lm);
		return "redirect:/lightmarkers";
	}

}
