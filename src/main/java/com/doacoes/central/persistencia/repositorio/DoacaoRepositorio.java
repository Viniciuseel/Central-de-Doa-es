package com.doacoes.central.persistencia.repositorio;

import com.doacoes.central.negocio.entity.Doacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoacaoRepositorio extends CrudRepository<Doacao, Long> {

    List<Doacao> findAll();

}