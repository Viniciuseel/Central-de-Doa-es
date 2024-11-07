package com.doacoes.central.persistencia.repositorio;


import com.doacoes.central.negocio.entity.Causa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CausaRepositorio extends JpaRepository<Causa, Long> {

}
