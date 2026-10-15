/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lasalle.tallerarboles.ejercicio01;
import java.util.Iterator;
/**
 *
 * @author Usuario
 */
public interface Arbolable<T> {
    int tamanio();
    boolean estaVacio();
    void vaciar();
    Iterator<T> iterator();
}
