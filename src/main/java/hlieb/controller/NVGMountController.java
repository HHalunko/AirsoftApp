package hlieb.controller;

import hlieb.model.gear.NVGMount;
import hlieb.service.NVGMountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NVGMountController {

	@Autowired
	@Qualifier("nvgmountService")
	private NVGMountService service;

	@RequestMapping(value = "/nvgmounts", method = RequestMethod.GET)
	public String listNVGMounts(Model model) {
		NVGMount nvgmount = new NVGMount();
		model.addAttribute("nvgmount",nvgmount);
		model.addAttribute("nvgmount",service.getAllNVGMounts());
		return "nvgmounts";
	}
	@RequestMapping(value = "/nvgmounts/add", method = RequestMethod.POST)
	public String addNVGMount(@ModelAttribute ("nvgmount") NVGMount p) {
		service.saveNVGMount(p);
		return "redirect:/nvgmounts";
	}

}
