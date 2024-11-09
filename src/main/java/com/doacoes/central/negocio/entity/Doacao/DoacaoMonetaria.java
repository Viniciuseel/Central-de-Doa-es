package com.doacoes.central.negocio.entity.Doacao;

import com.doacoes.central.negocio.enums.TipoDoacao;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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