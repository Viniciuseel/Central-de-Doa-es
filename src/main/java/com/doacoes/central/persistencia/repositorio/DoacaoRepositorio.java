package com.doacoes.central.persistencia.repositorio;

import com.doacoes.central.negocio.entity.Doacao.Doacao;
import com.doacoes.central.negocio.enums.TipoDoacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoacaoRepositorio extends CrudRepository<Doacao, Long> {

    List<Doacao> findAll();

}