package com.doacoes.central.persistencia.repositorio;

import com.doacoes.central.negocio.entity.Doacao;
import com.doacoes.central.negocio.enums.TipoDoacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoacaoRepositorio extends JpaRepository<Doacao, Long> {

    List<Doacao> findByTipo(TipoDoacao tipo);

    List<Doacao> findByValorGreaterThan(double valor);

    List<Doacao> findByDescricaoContaining(String descricao);
}