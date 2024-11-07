package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TipoCausa;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Causa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoCausa tipo;


    public Causa() {
    }

    public Causa(String descricao, TipoCausa tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoCausa getTipo() {
        return tipo;
    }

    public void setTipo(TipoCausa tipo) {
        this.tipo = tipo;
    }
}
