package com.example.guincho.services;

import com.example.guincho.GuinchoApplication;
import com.example.guincho.model.Guincho;
import com.example.guincho.repository.GuinchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class GuinchoService {
    @Autowired
    private GuinchoRepository guinchoRepository;

     public Guincho registrarEntrada(Guincho placaVeiculo){
        return guinchoRepository.save(placaVeiculo);
     }

     public List<Guincho>listar(){
        return guinchoRepository.findAll();
     }
}
