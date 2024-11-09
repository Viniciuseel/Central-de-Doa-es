package com.doacoes.central.negocio.entity.Causa;

import com.doacoes.central.negocio.enums.TipoCausa;
import jakarta.persistence.*;

import java.util.Objects;

@MappedSuperclass
public abstract class Causa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoCausa tipo;

    // Construtor padrão
    public Causa() {}

    // Construtor que inicializa os atributos
    public Causa(String descricao, TipoCausa tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    // Getters e setters
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
    //Identificar a instancia em uma lista
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Causa causa = (Causa) o;
        return Objects.equals(id, causa.id) && Objects.equals(descricao, causa.descricao) && tipo == causa.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, tipo);
    }
}
