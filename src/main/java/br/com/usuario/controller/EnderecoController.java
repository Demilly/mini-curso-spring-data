package br.com.usuario.controller;

import br.com.usuario.model.Endereco;
import br.com.usuario.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Endereco> createEndereco(@RequestBody Endereco endereco) {
        Endereco savedEndereco = enderecoService.createEndereco(endereco);
        return ResponseEntity.ok(savedEndereco);
    }

    @GetMapping
    public List<Endereco> getAllEnderecos() {
        return enderecoService.getAllEnderecos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> getEnderecoById(@PathVariable Long id) {
        Optional<Endereco> endereco = enderecoService.getEnderecoById(id);
        return endereco.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> updateEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
        try {
            Endereco updatedEndereco = enderecoService.updateEndereco(id, endereco);
            return ResponseEntity.ok(updatedEndereco);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEndereco(@PathVariable Long id) {
        try {
            enderecoService.deleteEndereco(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}