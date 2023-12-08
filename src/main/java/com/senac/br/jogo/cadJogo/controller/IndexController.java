package com.senac.br.jogo.cadJogo.controller;

import com.senac.br.jogo.cadJogo.dao.CadastroRepository;
import com.senac.br.jogo.cadJogo.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    CadastroRepository cadastroRepository;

    @GetMapping("/")
    public String abrir(Model model) {
        List<Jogador> jogadors = cadastroRepository.findAll();

        model.addAttribute("jogadores", jogadors);
        return "index";
    }
}
