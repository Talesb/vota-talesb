package br.edu.infnet.votatalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votatalesb.clients.VotacaoClient;
import br.edu.infnet.votatalesb.model.domain.dto.EleitorDTO;

@Service
public class EleitorService {

	@Autowired
	private VotacaoClient votacaoClient;
	
	public List<EleitorDTO> getAll(){
		return (List<EleitorDTO>) votacaoClient.obterListaEleitor();
	}

	public void incluir(EleitorDTO eleitor) {
		votacaoClient.incluirEleitor(eleitor);
	}

	public void remove(Integer id) {
		votacaoClient.removerEleitor(id);
	}
	
}
