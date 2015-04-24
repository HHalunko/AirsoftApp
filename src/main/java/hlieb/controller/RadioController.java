package hlieb.controller;

import hlieb.model.gear.Radio;
import hlieb.service.RadioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RadioController {

	@Autowired
	@Qualifier("radioService")
	private RadioService service;

	@RequestMapping(value = "/radios", method = RequestMethod.GET)
	public String listRadios(Model model) {
		Radio radio = new Radio();
		model.addAttribute("radio", radio);
		model.addAttribute("radios", service.getAllRadios());
		return "radios";
	}

	@RequestMapping(value = "/radios/add", method = RequestMethod.POST)
	public String addRadio(@ModelAttribute("radio") Radio r) {
		service.saveRadio(r);
		return "redirect:/radios";
	}

}
