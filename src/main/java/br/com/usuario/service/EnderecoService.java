package br.com.usuario.service;

import br.com.usuario.model.Endereco;

import java.util.List;
import java.util.Optional;

public interface EnderecoService {
    Endereco createEndereco(Endereco endereco);

    List<Endereco> getAllEnderecos();

    Optional<Endereco> getEnderecoById(Long id);

    Endereco updateEndereco(Long id, Endereco endereco);

    void deleteEndereco(Long id);
}
