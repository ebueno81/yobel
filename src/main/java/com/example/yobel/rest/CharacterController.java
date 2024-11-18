package com.example.yobel.rest;

import com.example.yobel.model.Characters;
import com.example.yobel.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@CrossOrigin(origins = "http://localhost:4200") // Permite solicitudes desde este origen
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/api")
    public List<Characters> getAllCharactersFromApi() {
        return characterService.getAllCharactersFromApi();
    }

    @GetMapping("/{id}")
    public Characters getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    @GetMapping("/filter")
    public List<Characters> getCharactersByFilter(@RequestParam String name) {
        return characterService.getCharactersByFilter(name);
    }
}
