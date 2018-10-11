package com.pruebatecnica.prueba.dao;

import com.pruebatecnica.prueba.entity.Administrador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorDao extends CrudRepository<Administrador, Integer> {

    @Query("SELECT count(a) FROM Administrador a WHERE a.usuario= :usuario and a.contrasena = :contrasena")
    public int existeAdmin(@Param("usuario") String usuario, @Param("contrasena") String contra);
}
