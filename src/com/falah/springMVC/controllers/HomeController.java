package com.falah.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.falah.springMVC.models.dragon;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePageRedirect() {
		String page = "redirect:home";
		
		return page;
	}
	
	@RequestMapping("/home")
	public String homePage() {
		String page = "homepage";
		
		return page;
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("form", "dragon", new Dragon());
    }
	
	@RequestMapping(value = "/form_input", method=RequestMethod.POST)
	public String submitInput(
			@ModelAttribute("dragon") Dragon dragon,
			BindingResult result,
			ModelMap model) {
		
		if(result.hasErrors())
			return "error";
		
		model.addAttribute("name", dragon.getName());
		model.addAttribute("element", dragon.getElement());
		model.addAttribute("atk", dragon.getAtk());
		model.addAttribute("def", dragon.getDef());
		model.addAttribute("hp", dragon.getHp());
		
		return "dragonView";
		
	}
}
