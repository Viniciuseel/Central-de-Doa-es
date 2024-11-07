package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TipoDoacao;

import javax.persistence.Entity;

@Entity
public class DoacaoMonetaria extends Doacao {
    private String tipoMonetaria;

    public DoacaoMonetaria() {
    }
    public DoacaoMonetaria(double valor, String descricao, String TipoMonetaria) {
        super(valor, descricao, TipoDoacao.MONETARIAS);
        this.tipoMonetaria = TipoMonetaria;
    }

    public String getTipoMaterial() {
        return tipoMonetaria;
    }

    public void setTipoMaterial(String tipoMonetaria) {
        this.tipoMonetaria = tipoMonetaria;
    }
}