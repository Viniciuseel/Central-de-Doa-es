package com.doacoes.central.negocio.dto;

import com.doacoes.central.negocio.enums.TipoDoacao;

import java.io.Serializable;

public class DoacaoDto implements Serializable {

    private Long id;
    private String descricao;
    private String tipo;
    private String doador;

    public DoacaoDto() {
    }

    public DoacaoDto(Long id, String descricao, String tipo){
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao =  descricao;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }
}
