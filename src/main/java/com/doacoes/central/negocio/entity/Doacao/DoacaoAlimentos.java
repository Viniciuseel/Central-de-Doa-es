package com.doacoes.central.negocio.entity.Doacao;

import com.doacoes.central.negocio.enums.TipoDoacao;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class DoacaoAlimentos extends Doacao {
        private String tipoAlimentos;

        public DoacaoAlimentos() {

        }
        public DoacaoAlimentos(double valor, String descricao, String TipoAlimentos){
            super(valor, descricao, TipoDoacao.ALIMENTOS);
            this.tipoAlimentos = TipoAlimentos;
        }
        public String getTipoMaterial(){
            return tipoAlimentos;
        }
        public void setTipoMaterial(String tipoAlimentos){
            this.tipoAlimentos = tipoAlimentos;
        }
    }

