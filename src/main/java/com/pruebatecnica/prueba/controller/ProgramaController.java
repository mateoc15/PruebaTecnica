package com.pruebatecnica.prueba.controller;

import com.pruebatecnica.prueba.entity.Programa;
import com.pruebatecnica.prueba.service.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.awt.*;



@RestController
@RequestMapping("/programa")
public class ProgramaController {
    @Autowired
    ProgramaService programaService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Programa> getAllProgramas() {

        return programaService.getAllProgramas();
    }

    @RequestMapping(value = "/addprograma", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Programa addNewPrograma(@RequestBody Programa programa) {
        return this.programaService.addPrograma(programa);
    }
}




