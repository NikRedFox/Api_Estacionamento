package com.example.guincho.model;

import jakarta.persistence.*;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="guincho")

public class Guincho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name="placaVeiculo")
    private String placaVeiculo;

    @Column(nullable = false)
    private String nomeCliente;

    @Column(nullable = false)
    private String foneCelular;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String cidade;

    public Guincho(){

    }

    public Guincho(String placaVeiculo, String nomeCliente, String foneCelular, String endereco, String cidade){
        this.placaVeiculo = placaVeiculo;
        this.nomeCliente = nomeCliente;
        this.foneCelular = foneCelular;
        this.endereco = endereco;
        this.cidade = cidade;
    }


    public Long getId(){
        return id;
    }
    public void setCarroId(Long id){
        this.id = id;
    }


    public String getPlacaVeiculo(){
        return placaVeiculo;
    }
    public void setPlacaVeiculo(){
        this.placaVeiculo = placaVeiculo;
    }


    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(){
        this.nomeCliente = nomeCliente;
    }


    public String getFoneCelular(){
        return foneCelular;
    }
    public void setFoneCelular(){
        this.foneCelular = foneCelular;
    }


    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }


    public String getCidade(){
        return cidade;
    }
    public void  setCidade(){
        this.cidade = cidade;
    }


}
