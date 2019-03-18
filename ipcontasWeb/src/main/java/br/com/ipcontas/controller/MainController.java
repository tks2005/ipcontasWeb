package br.com.ipcontas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {

		ModelAndView modelAndView = new ModelAndView("index");

		return modelAndView;
	}
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public ModelAndView clientes() {

		ModelAndView modelAndView = new ModelAndView("clientes/detalhes");

		return modelAndView;
	}
	
	@RequestMapping(value = "/vendas", method = RequestMethod.GET)
	public ModelAndView vendas() {

		ModelAndView modelAndView = new ModelAndView("vendas/detalhes");

		return modelAndView;
	}
}
