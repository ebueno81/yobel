/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yobel.repository;

import com.example.yobel.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author EBUEN
 */
public interface CharactersRepository extends JpaRepository<Characters,Long>{
    
}
