package br.com.usuario.controller;

import br.com.usuario.model.Usuario;
import br.com.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
        Usuario usuario = usuarioService.getUsuarioById(id);

        usuario.setNome(usuarioDetails.getNome());
        usuario.setIdade(usuarioDetails.getIdade());
        usuario.setEmail(usuarioDetails.getEmail());

        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioService.getUsuarioById(id);
        usuarioService.deleteUsuario(id);
    }

    @GetMapping("/lista/paginada")
    public Page<Usuario> listarUsuarios(
            @RequestParam(value = "pagina", defaultValue = "0") int pagina,
            @RequestParam(value = "tamanho", defaultValue = "10") int tamanho) {
        return usuarioService.listarUsuariosPaginados(pagina, tamanho);
    }
}
