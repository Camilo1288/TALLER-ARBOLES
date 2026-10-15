/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerarboles.ejercicio01;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
    public class Nodo<T> {
    private T elemento;
    private Nodo<T> padre;
    private List<Nodo<T>> hijos;

    public Nodo(T elemento) {
        this.elemento = elemento;
        this.padre = null;
        this.hijos = new ArrayList<>();
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<T> padre) {
        this.padre = padre;
    }

    public List<Nodo<T>> getHijos() {
        return hijos;
    }

    public void agregarHijo(Nodo<T> hijo) {
        hijo.setPadre(this);
        this.hijos.add(hijo);
    }
}
