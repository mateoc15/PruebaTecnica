package com.pruebatecnica.prueba.entity;

import javax.persistence.*;


@Entity
@Table(name = "PROGRAMA_TABLE")
public class Programa {


    @Column(name = "ID_PROGRAMA")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPrograma;

    @Column(name = "NOMBRE_PROGRAMA", nullable = false, length = 255)
    private String nombreProg;



    public  Programa(int idPrograma, String nombreProg){
        this.idPrograma=idPrograma;
        this.nombreProg=nombreProg;
    }
    protected Programa() {
    }


    public Integer getId() {
        return idPrograma;
    }

    public void setId(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombreProg() {
        return nombreProg;
    }

    public void setNombreProg(String nombreProg) {
        this.nombreProg = nombreProg;
    }

}
