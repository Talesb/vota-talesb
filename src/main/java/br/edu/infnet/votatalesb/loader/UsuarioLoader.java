package br.edu.infnet.votatalesb.loader;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votatalesb.model.domain.Role;
import br.edu.infnet.votatalesb.model.domain.Usuario;
import br.edu.infnet.votatalesb.model.service.RoleService;
import br.edu.infnet.votatalesb.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private RoleService roleService;

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		if (roleService.obterPorNome("ROLE_ADMIN") == null) {
			roleService.incluir(new Role("ROLE_ADMIN"));
		}

		if (roleService.obterPorNome("ROLE_USER") == null) {
			roleService.incluir(new Role("ROLE_USER"));
		}

		Usuario tales = new Usuario();
		tales.setEmail("talesloader@email.com");
		tales.setSenha("1234");
		tales.setNome("Tales");
		tales.setRoles(Arrays.asList(new Role(1), new Role(2)));

		Usuario elberth = new Usuario();
		elberth.setEmail("elberthloader@email.com");
		elberth.setSenha("1234");
		elberth.setNome("Elbert");
		elberth.setRoles(Arrays.asList(new Role(2)));

		if (usuarioService.findByEmail("elberthloader@email.com") == null
				&& usuarioService.findByEmail("elberthloader@email.com") == null) {
			usuarioService.incluir(tales);
			usuarioService.incluir(elberth);
		}

	}

}
