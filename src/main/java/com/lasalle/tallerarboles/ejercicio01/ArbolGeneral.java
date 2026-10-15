/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerarboles.ejercicio01;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author Usuario
 */
    public class ArbolGeneral<T> implements Arbolable<T> {
    protected Nodo<T> raiz;
    protected int cantidadNodos;

    public ArbolGeneral() {
        this.raiz = null;
        this.cantidadNodos = 0;
    }

    @Override
    public int tamanio() {
        return this.cantidadNodos;
    }

    @Override
    public boolean estaVacio() {
        return this.cantidadNodos == 0;
    }

    @Override
    public void vaciar() {
        this.raiz = null;
        this.cantidadNodos = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null; // Se complementará más adelante si se requiere recorrido
    }

    public Nodo<T> padre(Nodo<T> nodo) {
        if (nodo == null) return null;
        return nodo.getPadre();
    }

    public Collection<Nodo<T>> hijos(Nodo<T> nodo) {
        if (nodo == null) return Collections.emptyList();
        return nodo.getHijos();
    }

    public boolean esInterno(Nodo<T> nodo) {
        if (nodo == null) return false;
        return !esHoja(nodo);
    }

    public boolean esHoja(Nodo<T> nodo) {
        if (nodo == null) return false;
        return nodo.getHijos().isEmpty();
    }
}
