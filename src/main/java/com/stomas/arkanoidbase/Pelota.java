/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.arkanoidbase;

/**
 *
 * @author parag
 */
public class Pelota {

    private Integer posicion_x;
    private Integer posicion_y;
    private Integer velocidad;
    private String direccion;

    public Pelota(Integer posicion_x, Integer posicion_y, Integer velocidad, String direccion) {
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
        this.velocidad = velocidad;
        this.direccion = direccion;
    }

    public void mover() {
        //logica para mover la pelota
    }

    public void rebotar() {
        //logica para cambiar la direccion de la pelota tras un rebote
    }
}
