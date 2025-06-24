package com.jkalango.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fases")
public class FaseJogoController {
    
    @GetMapping
    public int mostrarQtdeFases() {
        return 7;
    }
}
