package com.doacoes.central.negocio.entity.Doacao;

import com.doacoes.central.negocio.enums.TipoDoacao;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
