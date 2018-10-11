package com.pruebatecnica.prueba.controller;

import com.pruebatecnica.prueba.entity.Administrador;
import com.pruebatecnica.prueba.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AdministradorController {
    @Autowired
    AdministradorService administradorService;

    @CrossOrigin
    @RequestMapping(value = "/admin", params = {"user", "pass"}, method = RequestMethod.GET)
    @ResponseBody
    public int esAdmin(@RequestParam("user") String user, @RequestParam("pass") String pass) {
        Administrador admin=new Administrador(user,pass);
        return administradorService.existeAdmin(admin);
    }



}
