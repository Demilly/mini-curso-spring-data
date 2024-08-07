package br.com.usuario.service;

import br.com.usuario.model.Usuario;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UsuarioService {

    List<Usuario> getAllUsuarios();

    Usuario getUsuarioById(Long id);

    Usuario createUsuario(Usuario usuario);

    Usuario updateUsuario(Long id, Usuario usuarioDetails);

    void deleteUsuario(Long id);

    Page<Usuario> listarUsuariosPaginados(int pagina, int tamanho);
}
