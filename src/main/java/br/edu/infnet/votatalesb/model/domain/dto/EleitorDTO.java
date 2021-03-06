package br.edu.infnet.votatalesb.model.domain.dto;

import java.util.List;

public class EleitorDTO {
	
	private String codigo;
	private String nome;
	private String email;
	private String telefone;
	private String token;
	private Integer qtdVotos;
	private Integer id;
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(Integer qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
