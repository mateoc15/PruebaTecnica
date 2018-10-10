package com.pruebatecnica.prueba.dao;

import com.pruebatecnica.prueba.entity.Encuesta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaDao extends CrudRepository<Encuesta, Integer> {

    @Query("SELECT COUNT(e) FROM Encuesta e where e.bebidaPref = 'gaseosa' and edad between 20 and  30")
    public int preferenciaGaseosa();



    @Query(" select e.bebidaPref, count(e) as num_orders from Encuesta e group by e.bebidaPref having count(e) = (select max(count(a.bebidaPref)) from Encuesta a group by a.bebidaPref)")
    public Iterable<Object> bebidaPreferida();

}
