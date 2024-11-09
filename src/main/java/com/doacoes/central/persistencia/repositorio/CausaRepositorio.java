package com.doacoes.central.persistencia.repositorio;


import com.doacoes.central.negocio.entity.Causa.Causa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CausaRepositorio extends CrudRepository<Causa, Long> {

    List<Causa> findAll();

}
