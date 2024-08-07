package br.com.usuario.service.impl;

import br.com.usuario.model.Telefone;
import br.com.usuario.repository.TelefoneRepository;
import br.com.usuario.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneServiceImpl implements TelefoneService {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Override
    public Telefone createTelefone(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    @Override
    public List<Telefone> getAllTelefones() {
        return telefoneRepository.findAll();
    }

    @Override
    public Optional<Telefone> getTelefoneById(Long id) {
        return telefoneRepository.findById(id);
    }

    @Override
    public Telefone updateTelefone(Long id, Telefone telefone) {
        if (!telefoneRepository.existsById(id)) {
            throw new IllegalArgumentException("Telefone com id " + id + " não encontrado.");
        }
        telefone.setId(id);
        return telefoneRepository.save(telefone);
    }

    @Override
    public void deleteTelefone(Long id) {
        if (!telefoneRepository.existsById(id)) {
            throw new IllegalArgumentException("Telefone com id " + id + " não encontrado.");
        }
        telefoneRepository.deleteById(id);
    }
}