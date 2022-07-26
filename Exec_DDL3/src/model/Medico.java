package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "medico")
public class Medico {
	
	@Id
	@Column(name = "crm", length = 7)
	@NotNull
	private char crm;
	
	@Column(name = "nome", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "celular", length = 11)
	@NotNull
	private char celular;
	
	@Column(name = "especialidade", length = 30)
	@NotNull
	private String especialidade;
	
	
	public char getCrm() {
		return crm;
	}
	public void setCrm(char crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getCelular() {
		return celular;
	}
	public void setCelular(char celular) {
		this.celular = celular;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", celular=" + celular + ", especialidade=" + especialidade
				+ "]";
	}
	
	
	
	
	
	
}
