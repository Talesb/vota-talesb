package br.edu.infnet.votatalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votatalesb.clients.VotacaoClient;
import br.edu.infnet.votatalesb.model.domain.dto.EleicaoDTO;

@Service
public class EleicaoService {
	
	@Autowired
	private VotacaoClient votacaoClient;

	public List<EleicaoDTO> getAll() {
		return (List<EleicaoDTO>) votacaoClient.obterListaEleicao();
	}

	public void incluir(EleicaoDTO eleicao) {
		votacaoClient.incluirEleicao(eleicao);
	}

	public void remove(Integer id) {
		votacaoClient.removerEleicao(id);
	}

	public EleicaoDTO getById(Integer id) {
		return votacaoClient.obterEleicaoPorId(id);
	}

}
