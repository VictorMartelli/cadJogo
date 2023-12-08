package com.senac.br.jogo.cadJogo.controller;

import com.senac.br.jogo.cadJogo.dao.CadastroRepository;
import com.senac.br.jogo.cadJogo.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JogadorController {

    @Autowired
    CadastroRepository cr;

    @GetMapping("/add")
    public String abrir(Jogador jogador) {return "adicionar";}

    @PostMapping("/salvar_jogador")
    public String salvar(Jogador jogador) {
        cr.save(jogador);
        return "index";
    }
}
