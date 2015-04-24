package hlieb.controller;

import hlieb.model.gear.Navigator;
import hlieb.service.NavigatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigatorController {

	@Autowired
	@Qualifier("navigatorService")
	private NavigatorService service;

	@RequestMapping(value = "/navigators", method = RequestMethod.GET)
	public String listNavigators(Model model) {
		Navigator navigator = new Navigator();
		model.addAttribute("navigator", navigator);
		model.addAttribute("navigators", service.getAllNavigators());
		return "navigators";
	}

	@RequestMapping(value = "/navigators/add", method = RequestMethod.POST)
	public String addNavigator(@ModelAttribute("navigator") Navigator n) {
		service.saveNavigator(n);
		return "redirect:/navigators";
	}

}
