package com.doacoes.central.negocio.entity.Doacao;

import com.doacoes.central.negocio.enums.TipoDoacao;
import jakarta.persistence.*;

import java.util.Objects;


@MappedSuperclass
public abstract class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valor;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoDoacao tipo;

    public Doacao() {
    }

    public Doacao(double valor, String descricao, TipoDoacao tipo) {
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoDoacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoDoacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doacao doacao = (Doacao) o;
        return Double.compare(valor, doacao.valor) == 0 && Objects.equals(id, doacao.id) && Objects.equals(descricao, doacao.descricao) && tipo == doacao.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor, descricao, tipo);
    }
}






