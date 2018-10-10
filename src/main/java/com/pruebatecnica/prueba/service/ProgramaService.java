package com.pruebatecnica.prueba.service;

import com.pruebatecnica.prueba.dao.ProgramaDao;
import com.pruebatecnica.prueba.entity.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProgramaService {
    @Autowired
    ProgramaDao programaDao;

    public Iterable<Programa> getAllProgramas() {
        return this.programaDao.findAll();
    }

    public Programa addPrograma(Programa programa) {
        return this.programaDao.save(programa);
    }





}
