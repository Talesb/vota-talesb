package br.edu.infnet.votatalesb.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.votatalesb.model.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByNome(String nome);

}
