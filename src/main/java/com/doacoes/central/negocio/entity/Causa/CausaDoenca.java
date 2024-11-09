package com.doacoes.central.negocio.entity.Causa;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CausaDoenca extends Causa{

}
