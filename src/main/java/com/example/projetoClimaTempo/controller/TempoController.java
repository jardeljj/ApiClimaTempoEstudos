package com.example.projetoClimaTempo.controller;

import com.example.projetoClimaTempo.Domain.TempoDTO;
import com.example.projetoClimaTempo.service.TempoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempoController {

    private final TempoService tempoService;


    public TempoController(TempoService tempoService) {
        this.tempoService = tempoService;
    }

    @GetMapping("/tempo")
    public TempoDTO getTempo(@RequestParam String city){
        return tempoService.getTempoPorCidade(city);
    }
}
