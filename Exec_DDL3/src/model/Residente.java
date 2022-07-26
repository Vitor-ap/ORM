package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente {

	@Id
	@JoinColumn(name = "crm")
	@NotNull
	private char medicoCrm;
	
	@Column(name = "instituicao", length = 50)
	@NotNull
	private String instituicao;
	
	@Column(name = "instituicao", length = 50)
	@NotNull
	private LocalDate ano_ingresso;
	
	
	public char getMedicoCrm() {
		return medicoCrm;
	}
	public void setMedicoCrm(char medicoCrm) {
		this.medicoCrm = medicoCrm;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public LocalDate getAno_ingresso() {
		return ano_ingresso;
	}
	public void setAno_ingresso(LocalDate ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}
	@Override
	public String toString() {
		return "Residente [medicoCrm=" + medicoCrm + ", instituicao=" + instituicao + ", ano_ingresso=" + ano_ingresso
				+ "]";
	}
	
	
	
	
	
	
	
}
