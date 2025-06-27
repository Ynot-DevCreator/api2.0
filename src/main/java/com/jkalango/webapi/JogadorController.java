package com.jkalango.webapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkalango.webapi.jogadores.DadosCadastradoJogador;
import com.jkalango.webapi.jogadores.Jogador;
import com.jkalango.webapi.jogadores.JogadorRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    // O que é injeção de dependencia?
    @Autowired
    private JogadorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastradoJogador dados){
        //System.out.println(json);
        repository.save(new Jogador(dados));
    }
}
