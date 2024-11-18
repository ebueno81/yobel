package com.example.yobel.service;

import com.example.yobel.dto.ApiResponse;
import com.example.yobel.model.Characters;
import com.example.yobel.repository.CharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CharacterService {

    private final String API_URL = "https://rickandmortyapi.com/api/character/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CharactersRepository characterRepository;

    public List<Characters> getAllCharactersFromApi() {
        ApiResponse response = restTemplate.getForObject(API_URL, ApiResponse.class);
        return response != null ? response.getResults() : List.of();
    }


    public Characters getCharacterById(Long id) {
        String url = API_URL + id; // Construye la URL para obtener el personaje por ID
        return restTemplate.getForObject(url, Characters.class);
    }


    public List<Characters> getCharactersByFilter(String name) {
        String url = API_URL + "?name=" + name; // Construye la URL con los filtros
        ApiResponse response = restTemplate.getForObject(url, ApiResponse.class);
        return response != null ? response.getResults() : List.of();
    }
}
