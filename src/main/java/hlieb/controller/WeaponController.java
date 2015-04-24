package hlieb.controller;

import hlieb.model.weapons.Weapon;
import hlieb.service.WeaponService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WeaponController {
	@Autowired
	@Qualifier("weaponService")
	private WeaponService service;

	@RequestMapping(value = "/weapons", method = RequestMethod.GET)
	public String listWeapons(Model model) {
		Weapon weapon = new Weapon();
		model.addAttribute("weapon", weapon);
		model.addAttribute("weapons",service.getAllWeapons());
		return "weapons";
	}
	@RequestMapping(value = "/weapons/add", method = RequestMethod.POST)
	public String addWeapon(@ModelAttribute ("weapon") Weapon w) {
		service.saveWeapon(w);
		return "redirect:/weapons";
	}

}
