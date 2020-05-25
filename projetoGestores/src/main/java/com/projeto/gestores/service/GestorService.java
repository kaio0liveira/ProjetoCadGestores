package com.projeto.gestores.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gestores.entity.Gestor;
import com.projeto.gestores.repositoty.GestorRepository;

@Service
public class GestorService {
	
	@Autowired
	private GestorRepository gr;
	
	public Gestor buscarId(Long id) {
		return gr.findById(id).get();
	}
}
