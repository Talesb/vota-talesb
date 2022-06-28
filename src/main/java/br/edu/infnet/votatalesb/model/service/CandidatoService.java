package br.edu.infnet.votatalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votatalesb.clients.VotacaoClient;
import br.edu.infnet.votatalesb.model.domain.dto.CandidatoDTO;
import br.edu.infnet.votatalesb.model.domain.dto.EleicaoDTO;

@Service
public class CandidatoService {

	@Autowired
	private VotacaoClient votacaoClient;

	public List<CandidatoDTO> getAll() {
		return (List<CandidatoDTO>) votacaoClient.obterListaCandidato();
	}

	public List<CandidatoDTO> getByEleicaoId(EleicaoDTO eleicao) {
		return votacaoClient.obterCandidatosPorEleicaoId(eleicao.getId());
	}

	public void incluir(CandidatoDTO candidato) {
		this.votacaoClient.incluirCandidato(candidato);
	}

	public void remove(Integer id) {
		this.votacaoClient.removerCandidato(id);
	}

}
