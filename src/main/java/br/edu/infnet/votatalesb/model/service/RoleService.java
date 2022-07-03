package br.edu.infnet.votatalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votatalesb.model.domain.Role;
import br.edu.infnet.votatalesb.model.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	public void incluir(Role role) {
		roleRepository.save(role);
	}

	public List<Role> obterLista() {
		return (List<Role>) roleRepository.findAll();

	}

	public Role obterPorNome(String nome) {
		return roleRepository.findByNome(nome);
	}

}
