package com.senac.br.jogo.cadJogo.dao;

import com.senac.br.jogo.cadJogo.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Jogador, Integer>{
}
