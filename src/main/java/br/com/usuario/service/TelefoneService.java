package br.com.usuario.service;

import br.com.usuario.model.Telefone;

import java.util.List;
import java.util.Optional;

public interface TelefoneService {
    Telefone createTelefone(Telefone telefone);
    List<Telefone> getAllTelefones();
    Optional<Telefone> getTelefoneById(Long id);
    Telefone updateTelefone(Long id, Telefone telefone);
    void deleteTelefone(Long id);
}
