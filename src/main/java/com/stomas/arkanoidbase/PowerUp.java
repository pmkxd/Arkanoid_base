/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.arkanoidbase;

/**
 *
 * @author parag
 */
public class PowerUp {
    private String tipo;

    public PowerUp(String tipo) {
        this.tipo = tipo;
    }
    
    public void aplicarEfecto(Nave nave, Pelota pelota){
        //logica para aplicar efecto en la nave o la pelota segun el tipo de powerup
    }
}
