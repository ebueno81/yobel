/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yobel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author EBUEN
 */
@Data
@Entity
@NoArgsConstructor
public class Characters {
    
    @Id
    private Long id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;


}

