package com.doacoes.central.negocio.service;

import com.doacoes.central.negocio.entity.Causa;
import com.doacoes.central.persistencia.repositorio.CausaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CausaServiceImpl implements CausaService {

    private final CausaRepositorio causaRepositorio;

    @Autowired
    public CausaServiceImpl(CausaRepositorio causaRepositorio) {
        this.causaRepositorio = causaRepositorio;
    }

    public Causa criarCausa(Causa causa) {
        return causaRepositorio.save(causa);
    }

    public List<Causa> listarCausas() {
        return causaRepositorio.findAll();
    }

    public Optional<Causa> buscarPorId(Long id) {
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
