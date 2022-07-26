package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity

@Table (name = "Bebe")

public class Bebe {

	@Id
	@ManyToOne
	@Column(name = "cpf_bebe", length = 11)
	@NotNull
	private int cpf_bebe;
	
	
	@Column(name = "nome_bebe", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate data;
	
	@Column(name = "altura", length = (int) 7.2)
	@NotNull
	private float altura;
	
	
	public int getId_bebe() {
		return cpf_bebe;
	}
	public void setId_bebe(int cpf_bebe) {
		this.cpf_bebe = cpf_bebe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Bebe [id_bebe=" + cpf_bebe + ", nome=" + nome + ", data=" + data + ", altura=" + altura + "]";
	}
	
	
	
}
