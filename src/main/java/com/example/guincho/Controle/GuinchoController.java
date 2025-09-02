package com.example.guincho.Controle;

import com.example.guincho.model.Guincho;
import com.example.guincho.services.GuinchoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/guincho")

public class GuinchoController {
    @Autowired
    private GuinchoService service;

    @PostMapping("entrada")
    public ResponseEntity<Guincho> registrarEntrada(@RequestBody Guincho placaVeiculo){
        Guincho veiculoRegistrado = service.registrarEntrada(placaVeiculo);
        return new ResponseEntity<>(veiculoRegistrado, HttpStatus.OK);
    }

    @GetMapping

    public ResponseEntity<List<Guincho>>Lista(){
        List<Guincho> placaVeiculos = service.listar();
        return new ResponseEntity<>(placaVeiculos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deletar(@PathVariable Long id){
        try{
            service.deletarVeiculo(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
