package hlieb.controller;

import hlieb.model.gear.PlateCarrier;
import hlieb.service.PlateCarrierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlateCarrierController {

	@Autowired
	@Qualifier("plateCarrierService")
	private PlateCarrierService service;

	@RequestMapping(value = "/platecarriers", method = RequestMethod.GET)
	public String listPlateCarriers(Model model) {
		PlateCarrier platecarrier = new PlateCarrier();
		model.addAttribute("platecarrier", platecarrier);
		model.addAttribute("platecarriers", service.getAllPlateCarriers());
		return "persons";
	}

	@RequestMapping(value = "/platecarriers/add", method = RequestMethod.POST)
	public String addPlateCarrier(@ModelAttribute("platecarrier") PlateCarrier pc) {
		service.savePlateCarrier(pc);
		return "redirect:/platecarriers";
	}

}
