package model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotNull;

public class Entregador extends Funcionario{

	
	@Id
	@Column(name="id_entregador")
	@NotNull
	private String id_entregador;
	
	@Column(name="num_cnh")
	@NotNull
	private String numCnh;
	
	@Column(name="cat_cnh")
	@NotNull
	private char catCnh;
	
	@JoinColumn(name="id_funcionario")
	@NotNull
	private String id_funcionario;
	
	
	
	
}
