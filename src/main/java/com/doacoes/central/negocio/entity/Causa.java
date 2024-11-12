package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TipoCausa;
import jakarta.persistence.*;

import java.util.Objects;


@Entity
public class Causa extends Transacao {





    public Causa() {
    }

    private TipoCausa tipo;


    public TipoCausa getTipo() {return tipo;}

    public void setTipo(TipoCausa tipo) { this.tipo = tipo; }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Causa causa = (Causa) o;
        return Objects.equals(getId(), causa.getId()) && Objects.equals(getDescricao(), causa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescricao());
    }

    @Override
    public String toString() {
        return "Causa{" +
                "id=" + getId() +
                ", descricao='" + getDescricao() + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}

