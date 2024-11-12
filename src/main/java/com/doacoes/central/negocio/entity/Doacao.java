package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TiposDoacao;
import jakarta.persistence.*;



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

