package br.edu.infnet.votatalesb.model.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.votatalesb.model.domain.Role;
import br.edu.infnet.votatalesb.model.domain.Usuario;
import br.edu.infnet.votatalesb.model.service.RoleService;
import br.edu.infnet.votatalesb.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private RoleService roleService;

	@GetMapping(value = "/usuario")
	public String telaUsuario(Model model) {
		model.addAttribute("roles", roleService.obterLista());
		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluirUsuario(Model model, Usuario usuario, @RequestParam Integer acesso) {
		usuario.setRoles(Arrays.asList(new Role(acesso)));
		usuarioService.incluir(usuario);
		return "redirect:/";
	}

}
