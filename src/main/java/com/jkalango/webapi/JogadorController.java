package com.jkalango.webapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkalango.webapi.jogadores.DadosCadastradoJogador;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastradoJogador json){
        System.out.println(json);
    }
}
