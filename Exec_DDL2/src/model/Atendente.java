package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "atendente")
public class Atendente extends Funcionario {

	@Id
	@Column(name= "id_atendente")
	@NotNull
	private  int idAtendente;
	
	@Column(name= "hora_entrada")
	@NotNull
	private LocalDate horaEntrada;
	
	@Column(name= "hora_saida")
	@NotNull
	private LocalDate horaSa�da;
	
	@Column(name= "email_atendente")
	@NotNull
	private String email;
	
	@JoinColumn(name= "id_funcionario")
	@NotNull
	private  int idFuncionario;

	public int getIdAtendente() {
		return idAtendente;
	}

	public void setIdAtendente(int idAtendente) {
		this.idAtendente = idAtendente;
	}

	public LocalDate getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDate horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalDate getHoraSa�da() {
		return horaSa�da;
	}

	public void setHoraSa�da(LocalDate horaSa�da) {
		this.horaSa�da = horaSa�da;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	@Override
	public String toString() {
		return "Atendende [idAtendente=" + idAtendente + ", horaEntrada=" + horaEntrada + ", horaSa�da=" + horaSa�da
				+ ", email=" + email + ", idFuncionario=" + idFuncionario + "]";
	}
	
	
	
	
	
}
