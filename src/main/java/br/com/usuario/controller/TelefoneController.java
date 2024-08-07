package br.com.usuario.controller;

import br.com.usuario.model.Telefone;
import br.com.usuario.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {

    @Autowired
    private TelefoneService telefoneService;

    @PostMapping
    public ResponseEntity<Telefone> createTelefone(@RequestBody Telefone telefone) {
        Telefone savedTelefone = telefoneService.createTelefone(telefone);
        return ResponseEntity.ok(savedTelefone);
    }

    @GetMapping
    public List<Telefone> getAllTelefones() {
        return telefoneService.getAllTelefones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Telefone> getTelefoneById(@PathVariable Long id) {
        Optional<Telefone> telefone = telefoneService.getTelefoneById(id);
        return telefone.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Telefone> updateTelefone(@PathVariable Long id, @RequestBody Telefone telefone) {
        try {
            Telefone updatedTelefone = telefoneService.updateTelefone(id, telefone);
            return ResponseEntity.ok(updatedTelefone);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelefone(@PathVariable Long id) {
        try {
            telefoneService.deleteTelefone(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
