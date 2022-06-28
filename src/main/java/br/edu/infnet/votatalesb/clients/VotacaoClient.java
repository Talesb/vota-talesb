package br.edu.infnet.votatalesb.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.votatalesb.model.domain.dto.CandidatoDTO;
import br.edu.infnet.votatalesb.model.domain.dto.EleicaoDTO;
import br.edu.infnet.votatalesb.model.domain.dto.EleitorDTO;
import br.edu.infnet.votatalesb.model.domain.dto.VotoDTO;
import br.edu.infnet.votatalesb.model.domain.dto.VotoDTO;
 

@FeignClient(url = "localhost:8080/api", name = "VotacaoClient")
public interface VotacaoClient {

	// Candidato
	@GetMapping(value = "/candidato")
	public List<CandidatoDTO> obterListaCandidato();

	@GetMapping(value = "/candidato/eleicao/{eleicaoId}")
	public List<CandidatoDTO> obterCandidatosPorEleicaoId(@PathVariable Integer eleicaoId);

	@PostMapping(value = "/candidato")
	public void incluirCandidato(@RequestBody CandidatoDTO candidato);

	@GetMapping(value = "candidato/{candidatoId}")
	public CandidatoDTO obterCandidatoPorId(@PathVariable Integer candidatoId);

	@DeleteMapping(value = "candidato/{candidatoId}")
	public void removerCandidato(@PathVariable Integer candidatoId);

	// Eleição
	@GetMapping(value = "/eleicao")
	public List<EleicaoDTO> obterListaEleicao();

	@PostMapping(value = "/eleicao")
	public void incluirEleicao(@RequestBody EleicaoDTO eleicao);

	@GetMapping(value = "eleicao/{eleicaoId}")
	public EleicaoDTO obterEleicaoPorId(@PathVariable Integer eleicaoId);

	@DeleteMapping(value = "eleicao/{eleicaoId}")
	public void removerEleicao(@PathVariable Integer eleicaoId);

	// Eleitor
	@GetMapping(value = "/eleitor")
	public List<EleitorDTO> obterListaEleitor();

	@PostMapping(value = "/eleitor")
	public void incluirEleitor(@RequestBody EleitorDTO eleitor);

	@GetMapping(value = "eleitor/{eleitorId}")
	public EleitorDTO obterEleitorPorId(@PathVariable Integer eleitorId);

	@DeleteMapping(value = "eleitor/{eleitorId}")
	public void removerEleitor(@PathVariable Integer eleitorId);

	// Voto
	@GetMapping(value = "/voto")
	public List<VotoDTO> obterListaVoto();

	@PostMapping(value = "/voto")
	public void incluirVoto(@RequestBody VotoDTO voto);

	@GetMapping(value = "voto/{votoId}")
	public VotoDTO obterVotoPorId(@PathVariable Integer votoId);

	@DeleteMapping(value = "voto/{votoId}")
	public void removerVoto(@PathVariable Integer votoId);

}
