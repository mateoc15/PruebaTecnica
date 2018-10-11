package com.pruebatecnica.prueba.controller;


import com.pruebatecnica.prueba.entity.Encuesta;
import com.pruebatecnica.prueba.service.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {
    @Autowired
    EncuestaService encuestaService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Encuesta> getAllEncuestas() {

        return encuestaService.getAllEncuestas();
    }

    @RequestMapping(value = "/addencuesta", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Encuesta addNewPrograma(@RequestBody Encuesta encuesta) {
        return this.encuestaService.addEncuesta(encuesta);
    }


    @RequestMapping(value = "/preferenciagaseosa", method = RequestMethod.GET)
    public int getPreferenciaGaseosa() {
        return encuestaService.obtenerPreferenciaGaseosa();
    }

    @RequestMapping(value = "/bebidapreferida", method = RequestMethod.GET)
    public Iterable<Object> getBebidaPreferida() {
        return encuestaService.obtenerBebidaPreferida();
    }

    @RequestMapping(value = "/numeroencuestas", method = RequestMethod.GET)
    public long getNumeroEncuestas() {
        return encuestaService.obtenerNumeroEncuestas();
    }

    @RequestMapping(value = "/menosparticipacion", method = RequestMethod.GET)
    public Iterable<Object> getMenorParticipacion() {
        return encuestaService.obtenerProgMenosParticipacion();
    }
}
