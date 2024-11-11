package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TiposDoacao;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Objects;


@Entity
public class Doacao extends Transacao {


    private String doador;

    private double valor;
    @Enumerated(EnumType.STRING)
    private TiposDoacao tipo;

    public TiposDoacao getTipo() {
        return tipo;
    }

    public void setTipo(TiposDoacao tipo) {
        this.tipo = tipo;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Doacao that = (Doacao) o;
//        return Double.compare(valor, that.valor) == 0 && Objects.equals(id, that.id) && Objects.equals(descricao, that.descricao);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, doador, valor, descricao);
//    }
//
    @Override
    public String toString() {
        return "Doacao{" +
                "id=" + getId() +
                ", doador='" + doador + '\'' +
                ", valor=" + valor +
                ", descricao='" + getDescricao() + '\'' +
                ",tipo='"+ getTipo()+'\''+
                '}';
    }
}

