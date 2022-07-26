package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
	@Table(name = "atendimento")
	public class Atendimento {
	  @Id
	  @Column(name = "id_atendimento")
	  @NotNull
	  private int id;

	  @ManyToOne
	  @JoinColumn(name = "matricula")
	  @NotNull
	  private Atendente atendente;

	  @ManyToOne
	  @JoinColumn(name = "id_cliente")
	  @NotNull
	  private Cliente cliente;

	  @Column(name = "data_atendimento")
	  @NotNull
	  private LocalDate data;

	  public int getId() {
	    return this.id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public Atendente getAtendente() {
	    return this.atendente;
	  }

	  public void setAtendente(Atendente atendente) {
	    this.atendente = atendente;
	  }

	  public Cliente getCliente() {
	    return this.cliente;
	  }

	  public void setCliente(Cliente cliente) {
	    this.cliente = cliente;
	  }

	  public LocalDate getData() {
	    return this.data;
	  }

	  public void setData(LocalDate data) {
	    this.data = data;
	  }

	  @Override
	  public String toString() {
	    return "{" +
	        " id='" + getId() + "'" +
	        ", atendente='" + getAtendente() + "'" +
	        ", cliente='" + getCliente() + "'" +
	        ", data='" + getData() + "'" +
	        "}";
	  }

	}

