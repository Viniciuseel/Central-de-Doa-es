package com.doacoes.central.negocio.service;

import com.doacoes.central.negocio.entity.Causa.Causa;
import com.doacoes.central.persistencia.repositorio.CausaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CausaService {

    private final CausaRepositorio causaRepositorio;  // Adapte conforme sua estrutura de repositório

    @Autowired
    public CausaService(CausaRepositorio causaRepositorio) {
        this.causaRepositorio = causaRepositorio;
    }

    public Causa criarCausa(Causa causa) {
        return causaRepositorio.save(causa);
    }

    public List<Causa> listarCausas() {
        return causaRepositorio.findAll();
    }

    public Optional<Causa> buscarCausaPorId(Long id) {
        return causaRepositorio.findById(id);
    }

    public Causa atualizarCausa(Long id, Causa causaAtualizada) {
        if (causaRepositorio.existsById(id)) {
            causaAtualizada.setId(id);
            return causaRepositorio.save(causaAtualizada);
        }
        return null;
    }

    public void excluirCausa(Long id) {
        causaRepositorio.deleteById(id);
    }
}
