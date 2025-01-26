package com.PassagemDeParametros.PassagemDeParametros.Entities;

import com.PassagemDeParametros.PassagemDeParametros.DTOs.PessoaDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.UUID;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String nome;

    @Column(unique = true)
    private long cpf;

    private String rg;

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Pessoa(PessoaDTO pessoaDTO){
        this.nome = pessoaDTO.nome();
        this.cpf = pessoaDTO.cpf();
        this.rg = pessoaDTO.rg();
        this.rua = pessoaDTO.rua();
        this.numero = pessoaDTO.numero();
        this.bairro = pessoaDTO.bairro();
        this.cidade = pessoaDTO.cidade();
        this.cep = pessoaDTO.cep();
    }

    public Pessoa() {
    }

    public Pessoa(int id, String nome, long cpf, String rg, String rua, String numero, String bairro, String cidade, String cep) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Pessoa(int id, String cep, String cidade, String bairro, String numero, String rua, String rg, long cpf, String nome) {
        this.id = id;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", rg='" + rg + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
