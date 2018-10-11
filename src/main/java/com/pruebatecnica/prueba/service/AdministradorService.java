package com.pruebatecnica.prueba.service;


import com.pruebatecnica.prueba.dao.AdministradorDao;
import com.pruebatecnica.prueba.entity.Administrador;
import com.pruebatecnica.prueba.entity.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {
    @Autowired
    AdministradorDao administradorDao;

    public int existeAdmin(Administrador admin) {
        return this.administradorDao.existeAdmin(admin.getUsuario(),admin.getContrasena());
    }

/*    public Administrador addPrograma(Administrador admin) {
        return this.administradorDao.save(admin);
    }
*/
}
