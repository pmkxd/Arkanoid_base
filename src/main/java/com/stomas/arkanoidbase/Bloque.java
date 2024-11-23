/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.arkanoidbase;

/**
 *
 * @author parag
 */
public class Bloque {
    private Integer resistencia;
    private String tipo;

    public Bloque(Integer resistencia, String tipo) {
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    
    private void destruir(){
        //lógica para destruir o dañar el bloque
    }
    private void liberarEfecto(){
        //lógica para liberar un powerup si corresponde
    }
}
