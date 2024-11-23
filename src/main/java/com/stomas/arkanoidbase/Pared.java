/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.arkanoidbase;

/**
 *
 * @author parag
 */
public class Pared {
    private Integer posicion_x;
    private Integer posicion_y;

    public Pared(Integer posicion_x, Integer posicion_y) {
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
    }
    
    public boolean detectarColision(Pelota pelota){
        //logica para detectar si la pelota colisiona con la pared
        return false;
    }
}
