package br.edu.infnet.votatalesb.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.edu.infnet.votatalesb.model.domain.Usuario;
import br.edu.infnet.votatalesb.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public void incluir(Usuario usuario) {
		usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
		usuarioRepository.save(usuario);

	}

	public void excluir(Integer usuarioId) {
		usuarioRepository.deleteById(usuarioId);
	}

	public Usuario autenticar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		if (usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}

	public Usuario findByEmail(String string) {
		return this.usuarioRepository.findByEmail(string);
	}

}
