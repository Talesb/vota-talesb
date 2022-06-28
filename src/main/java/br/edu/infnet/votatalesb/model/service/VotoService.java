package br.edu.infnet.votatalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votatalesb.clients.VotacaoClient;
import br.edu.infnet.votatalesb.model.domain.dto.VotoDTO;
import br.edu.infnet.votatalesb.model.domain.dto.VotoDTO;

@Service
public class VotoService {
 
	@Autowired
	private VotacaoClient votacaoClient;
	
	public List<VotoDTO> getAll(){
		return (List<VotoDTO>) votacaoClient.obterListaVoto();
	}

	public void incluir(VotoDTO voto) {
		votacaoClient.incluirVoto(voto);
	}

	public void remove(Integer id) {
		votacaoClient.removerVoto(id);
	}

}
