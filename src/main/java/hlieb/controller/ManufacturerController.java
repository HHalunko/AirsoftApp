package hlieb.controller;

import hlieb.model.Manufacturer;
import hlieb.service.ManufacturerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManufacturerController {

	@Autowired
	@Qualifier("manufacturerService")
	private ManufacturerService service;

	@RequestMapping(value = "/manufacturers", method = RequestMethod.GET)
	public String listManufacturers(Model model) {
		Manufacturer manufacturer = new Manufacturer();
		model.addAttribute("manufacturer", manufacturer);
		model.addAttribute("manufacturer", service.getAllManufacturers());
		return "manufacturers";
	}

	@RequestMapping(value = "/manufacturers/add", method = RequestMethod.POST)
	public String addManufacturer(@ModelAttribute("manufacturer") Manufacturer m) {
		service.saveManufacturer(m);
		return "redirect:/manufacturers";
	}

}
