package br.com.usuario.service.impl;


import br.com.usuario.model.Endereco;
import br.com.usuario.repository.EnderecoRepository;
import br.com.usuario.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Endereco createEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    @Override
    public Optional<Endereco> getEnderecoById(Long id) {
        return enderecoRepository.findById(id);
    }

    @Override
    public Endereco updateEndereco(Long id, Endereco endereco) {
        if (!enderecoRepository.existsById(id)) {
            throw new IllegalArgumentException("Endereco com id " + id + " não encontrado.");
        }
        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }

    @Override
    public void deleteEndereco(Long id) {
        if (!enderecoRepository.existsById(id)) {
            throw new IllegalArgumentException("Endereco com id " + id + " não encontrado.");
        }
        enderecoRepository.deleteById(id);
    }
}