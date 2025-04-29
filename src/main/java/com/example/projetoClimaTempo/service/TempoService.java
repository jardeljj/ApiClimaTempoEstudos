package com.example.projetoClimaTempo.service;

import com.example.projetoClimaTempo.Domain.TempoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TempoService {

    private static final String API_KEY = "17a4a37534c2061710eade2044d0b261";
    private static final String URL = "https://api.openweathermap.org/data/2.5/weather";

    private final RestTemplate restTemplate;

    public TempoService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public TempoDTO getTempoPorCidade(String city){
        String url = String.format("%s?q=%s&appid=%s&units=metric", URL, city, API_KEY);
        return restTemplate.getForObject(url, TempoDTO.class);
    }
}
