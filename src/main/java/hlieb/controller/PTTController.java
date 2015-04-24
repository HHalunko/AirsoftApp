package hlieb.controller;

import hlieb.model.gear.PTT;
import hlieb.service.PTTService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PTTController {

	@Autowired
	@Qualifier("PTTService")
	private PTTService service;

	@RequestMapping(value = "/ptts", method = RequestMethod.GET)
	public String listPTTs(Model model) {
		PTT ptt = new PTT();
		model.addAttribute("ptt",ptt);
		model.addAttribute("ptts",service.getAllPTTs());
		return "ptts";
	}
	@RequestMapping(value = "/ptts/add", method = RequestMethod.POST)
	public String addPTT(@ModelAttribute ("ptt") PTT ptt) {
		service.savePTT(ptt);
		return "redirect:/ptts";
	}

}
