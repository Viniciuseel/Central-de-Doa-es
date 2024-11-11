package com.doacoes.central.negocio.service;

import com.doacoes.central.negocio.entity.Causa;
import com.doacoes.central.negocio.enums.TipoCausa;

import java.util.List;
import java.util.Optional;

public interface CausaService {
    Causa criarCausa(Causa causa);

    Causa atualizarCausa(Long id, TipoCausa tipo, Causa causa);

    void excluirCausa(Long id);

    Optional<Causa> buscarPorId(Long id);

    List<Causa> listarCausas();
}
