/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerarboles.ejercicio03;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        String preorden = "GEAIBMCLDFKJH";
        String inorden = "IABEGLDCFMKHJ";

        ReconstructorArbol reconstructor = new ReconstructorArbol();
        String postorden = reconstructor.obtenerPostorden(preorden, inorden);

        System.out.println("Recorrido Preorden : " + preorden);
        System.out.println("Recorrido Inorden  : " + inorden);
        System.out.println("Recorrido Postorden: " + postorden);
    }
    
}
