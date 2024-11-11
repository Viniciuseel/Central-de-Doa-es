package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TipoCausa;
import jakarta.persistence.*;

import java.util.Objects;


@Entity
public class Causa extends Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    public Causa() {
    }

    private TipoCausa tipo;


    public TipoCausa getTipo() {return tipo;}

    public void setTipo(TipoCausa tipo) { this.tipo = tipo; }

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Causa causa = (Causa) o;
        return Objects.equals(id, causa.id) && Objects.equals(descricao, causa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }

    @Override
    public String toString() {
        return "Causa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}

