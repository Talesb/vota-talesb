package br.edu.infnet.votatalesb.model.domain.dto;

public class CandidatoDTO {

	private Integer numero;
	private String nome;
	private Integer eleicaoId;
	private String eleicao;
	private Integer quantidadeDeVotos;
	private Integer id;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEleicaoId() {
		return eleicaoId;
	}

	public void setEleicaoId(Integer eleicaoId) {
		this.eleicaoId = eleicaoId;
	}

	public String getEleicao() {
		return eleicao;
	}

	public void setEleicao(String eleicao) {
		this.eleicao = eleicao;
	}

	public Integer getQuantidadeDeVotos() {
		return quantidadeDeVotos;
	}

	public void setQuantidadeDeVotos(Integer quantidadeDeVotos) {
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
