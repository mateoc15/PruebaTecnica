package com.pruebatecnica.prueba.entity;

import javax.persistence.*;

@Entity
@Table(name = "ENCUESTA_TABLE")
public class Encuesta {
    @Column(name = "ID_ENCUESTA")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEncuesta;

    @ManyToOne
    @JoinColumn(name = "ID_PROGRAMA")
    private Programa programa;

    @Column(name = "GENERO", nullable = false, length = 255)
    private String genero;

    @Column(name = "EDAD", nullable = false, length = 255)
    private int edad;

    @Column(name = "BEBIDA_PREF", nullable = false, length = 255)
    private String bebidaPref;

    public  Encuesta(int idEncuesta, Programa programa, String genero, int edad, String bebidaPref){
        this.idEncuesta=idEncuesta;
        this.genero=genero;
        this.edad= edad;
        this.bebidaPref= bebidaPref;
    }
    protected Encuesta() {
    }

    public Integer getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Integer idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBebidaPref() {
        return bebidaPref;
    }

    public void setBebidaPref(String bebidaPref) {
        this.bebidaPref = bebidaPref;
    }
}
