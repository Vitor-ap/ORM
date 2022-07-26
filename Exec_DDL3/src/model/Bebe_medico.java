package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Bebe_medico")

public class Bebe_medico {

	@Id
	@JoinColumn(name = "cpf_bebe")
	@NotNull
	private int id;
	
	@Id
	@JoinColumn(name = "crm")
	private char crm;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getCrm() {
		return crm;
	}
	public void setCrm(char crm) {
		this.crm = crm;
	}
	@Override
	public String toString() {
		return "Bebe_medico [id=" + id + ", crm=" + crm + "]";
	}
	
	
	
	
}
