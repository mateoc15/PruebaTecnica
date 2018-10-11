package com.pruebatecnica.prueba.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "ADMINISTRADOR_TABLE")
public class Administrador {

    @Column(name = "ID_Admin")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAdmin;

    @Column(name = "USUARIO", nullable = false, unique = true,length = 255)
    private String usuario;

    @Column(name = "CONTRASENA", nullable = false, length = 255)
    private String contrasena;


    public  Administrador(String usuario, String contrasena){
        this.usuario=usuario;
        this.contrasena=contrasena;
    }
    protected Administrador() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
