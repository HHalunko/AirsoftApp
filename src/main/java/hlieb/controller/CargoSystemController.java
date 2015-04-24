package hlieb.controller;

import hlieb.model.gear.CargoSystem;
import hlieb.service.CargoSystemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CargoSystemController {

	@Autowired
	@Qualifier("cargoSystemService")
	private CargoSystemService service;

	@RequestMapping(value = "/cargosystems", method = RequestMethod.GET)
	public String listCargoSystems(Model model) {
		CargoSystem cargosystem = new CargoSystem();
		model.addAttribute("cargosystem", cargosystem);
		model.addAttribute("cargosystems", service.getAllCargoSystems());
		return "cargosystems";
	}

	@RequestMapping(value = "/cargosystems/add", method = RequestMethod.POST)
	public String addCargoSystem(@ModelAttribute("cargosystem") CargoSystem cs) {
		service.saveCargoSystem(cs);
		return "redirect:/cargosystems";
	}

}
