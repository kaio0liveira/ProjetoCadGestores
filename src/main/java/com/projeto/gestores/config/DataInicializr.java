package com.projeto.gestores.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.projeto.gestores.entity.Gestor;
import com.projeto.gestores.repositoty.GestorRepository;

	@Component
	public class DataInicializr implements ApplicationListener<ContextRefreshedEvent> {

		@Autowired
		GestorRepository repository;
		
		
		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			
			Gestor gestor = new Gestor(1L, "Kaio", "121314", "01121999", "Developer");
			repository.save(gestor);
		}
		
		
		
	}


