package com.projeto.gestores.entity;



import javax.persistence.*;


@Entity
public class Gestor  {
	

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String matricula;
	private String dataNascimento;
	private String setor;
	
	public  Gestor() {
		
	}
	
	
	public Gestor(Long id, String nome, String matricula, String dataNascimento, String setor) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.setor = setor;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
