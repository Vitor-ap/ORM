package model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Cliente {

	@Id
	@Column(name = "cpf_cliente")
	@NotNull
	private String cpf;
	
	@Column(name = "nome_cliente")
	@NotNull
	private String nome;
	
	@Column(name = "tel_cliente")
	@NotNull
	private String telefone;
	
	@Column(name = "email_cliente")
	@NotNull
	private String emailCl;
	
	@Column(name = "pronome_cliente")
	@NotNull
	private String pronome;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmailCl() {
		return emailCl;
	}

	public void setEmailCl(String emailCl) {
		this.emailCl = emailCl;
	}

	public String getPronome() {
		return pronome;
	}

	public void setPronome(String pronome) {
		this.pronome = pronome;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", emailCl=" + emailCl
				+ ", pronome=" + pronome + "]";
	}
	
	
	
	
}
