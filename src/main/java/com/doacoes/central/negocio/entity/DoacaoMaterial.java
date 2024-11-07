package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TipoDoacao;

import javax.persistence.Entity;

@Entity
public class DoacaoMaterial extends Doacao {
    private String tipoMaterial;

    public DoacaoMaterial() {
    }
    public DoacaoMaterial(double valor, String descricao, String TipoMaterial){
        super(valor, descricao, TipoDoacao.MATERIAL);
        this.tipoMaterial = TipoMaterial;
    }
    public String getTipoMaterial(){
        return tipoMaterial;
    }
    public void setTipoMaterial(String tipoMaterial){
        this.tipoMaterial = tipoMaterial;
    }
}
