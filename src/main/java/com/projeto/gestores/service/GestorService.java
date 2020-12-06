package com.projeto.gestores.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gestores.entity.Gestor;
import com.projeto.gestores.exception.NotFoundId;
import com.projeto.gestores.repositoty.GestorRepository;

@Service
public class GestorService {

	@Autowired
	private GestorRepository gr;

	public void delete(Long id) throws NotFoundId {

		Optional<Gestor> gestor = gr.findById(id);
		
		if (!gestor.isPresent()) {
			throw new NotFoundId("ID " +id+" não existe!");
		}else {
			gr.deleteById(id);
		}
	}

	public Gestor buscarId(Long id) throws NotFoundId {

		Optional<Gestor> gestor = gr.findById(id);
		Gestor gestor1 = null;
		if (!gestor.isPresent()) {
			throw new NotFoundId("ID " +id +" não existe!");
		}else {
			gestor1 = gestor.get();
		}

		return gestor1;
	}
}
