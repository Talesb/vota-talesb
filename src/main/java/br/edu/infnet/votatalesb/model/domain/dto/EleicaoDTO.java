package br.edu.infnet.votatalesb.model.domain.dto;

public class EleicaoDTO {

	private String descricao;
	private Integer quantidadeDeVotos;
	private Integer quantidadeDeCandidatos;
	private Integer id;

	public EleicaoDTO() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidadeDeVotos() {
		return quantidadeDeVotos;
	}

	public void setQuantidadeDeVotos(Integer quantidadeDeVotos) {
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

	public Integer getQuantidadeDeCandidatos() {
		return quantidadeDeCandidatos;
	}

	public void setQuantidadeDeCandidatos(Integer quantidadeDeCandidatos) {
		this.quantidadeDeCandidatos = quantidadeDeCandidatos;
	}

}
