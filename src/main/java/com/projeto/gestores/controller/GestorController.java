package com.projeto.gestores.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.gestores.entity.Gestor;
import com.projeto.gestores.exception.NotFoundId;
import com.projeto.gestores.repositoty.GestorRepository;
import com.projeto.gestores.service.GestorService;

@Controller
public class GestorController {
	
	@Autowired
	private GestorRepository gestorRepository;
	
	@Autowired
	private GestorService service;
	
	
	
	@RequestMapping(value="/cadastrarGestor", method=RequestMethod.GET)
	public String form(){
		return "cadastrar";
	}
	
	@RequestMapping(value = "cadastrarGestor", method = RequestMethod.POST)
	public String cadastrar(Gestor gestor) {
		gestorRepository.save(gestor);
		
		
		return "redirect:cadastrarGestor";
	}
	
	@GetMapping("/gestor")
	public String listar(Model model) {
		
		model.addAttribute("gestorList", this.gestorRepository.findAll());
		
		return "gestorListar";
	
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable(name="id") Long id) throws NotFoundId {
		ModelAndView mv = new ModelAndView("editar");
		Gestor gestor = service.buscarId(id);
		mv.addObject("gestor", gestor);	
		
		return mv;
		
	}
	  

	   
	@RequestMapping("/deletar/{id}")
	public String deletar(@PathVariable(name = "id") Long id) throws NotFoundId {
		service.delete(id);
		
		return "redirect:/gestor";
	}
}
