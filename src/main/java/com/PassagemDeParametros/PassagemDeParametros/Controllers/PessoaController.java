package com.PassagemDeParametros.PassagemDeParametros.Controllers;

import com.PassagemDeParametros.PassagemDeParametros.DTOs.PessoaDTO;
import com.PassagemDeParametros.PassagemDeParametros.Entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {


    @GetMapping("/listar")
    public ResponseEntity buscarTodos(){
        return new ResponseEntity("Bateu", HttpStatus.OK);
    }


}
