package com.jkalango.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Alo")
public class AloController {

    // requisição e resposta (REQUEST E RESPONSE)
    // HTTP - GET, POST, DELETE, PUT, PATCH 
    //método Java - foco HTTP-REST-RESTFull
    //HotReload - Carregamento Rápido
    @GetMapping
    public String mostrarMsg() {
        return "Alo mundo, JKalango!";
    }
}
