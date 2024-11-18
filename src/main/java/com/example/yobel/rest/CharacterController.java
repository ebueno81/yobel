package com.example.yobel.rest;

import com.example.yobel.model.Characters;
import com.example.yobel.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 4aba9588c989a0a543eb600a021d1e78bff68b70

import java.util.List;

@RestController
@RequestMapping("/api/characters")
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:4200") // Permite solicitudes desde este origen
=======
>>>>>>> 4aba9588c989a0a543eb600a021d1e78bff68b70
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
<<<<<<< HEAD
    public List<Characters> getCharactersByFilter(@RequestParam String name) {
        return characterService.getCharactersByFilter(name);
=======
    public List<Characters> getCharactersByFilter(@RequestParam String name, @RequestParam String status) {
        return characterService.getCharactersByFilter(name, status);
>>>>>>> 4aba9588c989a0a543eb600a021d1e78bff68b70
    }
}
