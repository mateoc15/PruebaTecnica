package com.pruebatecnica.prueba.service;

import com.pruebatecnica.prueba.dao.EncuestaDao;
import com.pruebatecnica.prueba.entity.Encuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService {
    @Autowired
    EncuestaDao encuestaDao;

    public Iterable<Encuesta> getAllEncuestas() {
        return this.encuestaDao.findAll();
    }

    public Encuesta addEncuesta(Encuesta encuesta) {
        return this.encuestaDao.save(encuesta);
    }
    /*
    public int obtenerPreferenciaGaseosa(){
        return this.encuestaDao.preferenciaGaseosa();
    }*/
    public int obtenerPreferenciaGaseosa(){
        return this.encuestaDao.preferenciaGaseosa();
    }

    public Iterable<Object> obtenerBebidaPreferida(){ return this.encuestaDao.bebidaPreferida();}

    public long obtenerNumeroEncuestas(){
        return this.encuestaDao.count();
    }

}
