package com.PassagemDeParametros.PassagemDeParametros.Repositories;

import com.PassagemDeParametros.PassagemDeParametros.Entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaRepositoy extends JpaRepository<Pessoa, Integer> {
}
