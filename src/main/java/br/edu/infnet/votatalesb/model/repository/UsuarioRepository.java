package br.edu.infnet.votatalesb.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.votatalesb.model.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	Usuario findByEmail(String email);

}
