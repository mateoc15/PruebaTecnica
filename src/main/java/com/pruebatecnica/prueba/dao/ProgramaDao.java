package com.pruebatecnica.prueba.dao;

import com.pruebatecnica.prueba.entity.Programa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProgramaDao extends CrudRepository<Programa, Integer> {


}
