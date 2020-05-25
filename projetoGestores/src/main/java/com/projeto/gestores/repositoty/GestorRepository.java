package com.projeto.gestores.repositoty;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.gestores.entity.Gestor;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long>  {
	
 Gestor findByNome(String nome);

}
