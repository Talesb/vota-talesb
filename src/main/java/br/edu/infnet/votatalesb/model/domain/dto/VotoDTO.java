package br.edu.infnet.votatalesb.model.domain.dto;

public class VotoDTO {

	private Integer id;
	private Integer eleitorId;
	private String nomeEleitor;
	private Integer eleicaoId;
	private String descricaoEleicao;
	private Integer candidatoId;
	private String nomeCandidato;
	private String localizacao;

	public VotoDTO() {

	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEleitorId() {
		return eleitorId;
	}

	public void setEleitorId(Integer eleitorId) {
		this.eleitorId = eleitorId;
	}

	public String getNomeEleitor() {
		return nomeEleitor;
	}

	public void setNomeEleitor(String nomeEleitor) {
		this.nomeEleitor = nomeEleitor;
	}

	public Integer getEleicaoId() {
		return eleicaoId;
	}

	public void setEleicaoId(Integer eleicaoId) {
		this.eleicaoId = eleicaoId;
	}

	public String getDescricaoEleicao() {
		return descricaoEleicao;
	}

	public void setDescricaoEleicao(String descricaoEleicao) {
		this.descricaoEleicao = descricaoEleicao;
	}

	public Integer getCandidatoId() {
		return candidatoId;
	}

	public void setCandidatoId(Integer candidatoId) {
		this.candidatoId = candidatoId;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

}
