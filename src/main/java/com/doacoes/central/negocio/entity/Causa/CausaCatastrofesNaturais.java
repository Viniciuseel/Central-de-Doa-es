package com.doacoes.central.negocio.entity.Causa;

import com.doacoes.central.negocio.enums.TipoCausa;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CausaCatastrofesNaturais extends Causa {

    private String tipoCatastrofesNaturais;

    public CausaCatastrofesNaturais() {}

    public CausaCatastrofesNaturais(String descricao, String tipoCatastrofesNaturais) {
        super(descricao, TipoCausa.CATASTROFESNATURAIS);
        this.tipoCatastrofesNaturais = tipoCatastrofesNaturais;
    }

    public String getTipoCatastrofesNaturais() {
        return tipoCatastrofesNaturais;
    }

    public void setTipoCatastrofesNaturais(String tipoCatastrofesNaturais) {
        this.tipoCatastrofesNaturais = tipoCatastrofesNaturais;
    }
}
