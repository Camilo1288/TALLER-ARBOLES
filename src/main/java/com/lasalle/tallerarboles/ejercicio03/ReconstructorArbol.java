/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerarboles.ejercicio03;
import java.util.HashMap;
/**
 *
 * @author Usuario
 */
    public class ReconstructorArbol {
    private HashMap<Character, Integer> inordenIndexMap;
    private int preordenIndex;

    public String obtenerPostorden(String preorden, String inorden) {
        inordenIndexMap = new HashMap<>();
        for (int i = 0; i < inorden.length(); i++) {
            inordenIndexMap.put(inorden.charAt(i), i);
        }
        preordenIndex = 0;
        StringBuilder postorden = new StringBuilder();
        construirPostordenHelper(preorden, 0, inorden.length() - 1, postorden);
        return postorden.toString();
    }

    private void construirPostordenHelper(String preorden, int inInicio, int inFin, StringBuilder postorden) {
        if (inInicio > inFin) {
            return;
        }

        char raizVal = preorden.charAt(preordenIndex++);
        int inIndex = inordenIndexMap.get(raizVal);

        // Recorrer subárbol izquierdo
        construirPostordenHelper(preorden, inInicio, inIndex - 1, postorden);
        // Recorrer subárbol derecho
        construirPostordenHelper(preorden, inIndex + 1, inFin, postorden);
        
        // Agregar raíz al final (Postorden: Izquierda, Derecha, Raíz)
        postorden.append(raizVal);
    }
}
