package com.doacoes.central.negocio.entity;

import com.doacoes.central.negocio.enums.TipoDoacao;

import javax.persistence.Entity;
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

