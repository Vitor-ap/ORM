package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "funcionario")

public class Funcionario {

	@Id
	@Column(name = "id_funcionario")
	@NotNull
	private int id_Funcionario;
	
	@Column(name = "nome_funcionario")
	@NotNull
	private String nome;
	
	@Column(name = "dataNasc")
	@NotNull
	private LocalDate dataNasc;
	
	@Column(name = "salario")
	@NotNull
	private double salario;
	
	@Column(name = "telefone")
	private String telefone;
	
	
	
	
	public int getId_Funcionario() {
		return id_Funcionario;	
	}
	
	public void setId_Funcionario(int id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Funcionario [id_Funcionario=" + id_Funcionario + ", nome=" + nome + ", dataNasc=" + dataNasc
				+ ", salario=" + salario + ", telefone=" + telefone + "]";
	}
	
	
	
	
}
