package br.com.usuario.service.impl;

import br.com.usuario.controller.exception.ResourceNotFoundException;
import br.com.usuario.model.Usuario;
import br.com.usuario.repository.UsuarioRepository;
import br.com.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com id " + id));
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuarioDetails) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com id " + id));

        usuario.setNome(usuarioDetails.getNome());
        usuario.setIdade(usuarioDetails.getIdade());
        usuario.setEmail(usuarioDetails.getEmail());
        usuario.setTelefones(usuarioDetails.getTelefones());
        usuario.setEnderecos(usuarioDetails.getEnderecos());

        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com id " + id));
        usuarioRepository.delete(usuario);
    }

    @Override
    public Page<Usuario> listarUsuariosPaginados(int pagina, int tamanho) {
        Pageable pageable = PageRequest.of(pagina, tamanho);
        return usuarioRepository.findAll(pageable);
    }
}
