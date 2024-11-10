package com.doacoes.central.negocio.service;

import com.doacoes.central.negocio.entity.Doacao;

import java.util.List;
import java.util.Optional;

public interface DoacaoService
{
    Doacao criarDoacao(Doacao doacao);

    List<Doacao> listarDoacoes();

    Doacao atualizarDoacao(Long id, Doacao doacao);

    void excluirDoacao(Long id);

    Optional<Doacao> buscarPorId(Long id);

}

