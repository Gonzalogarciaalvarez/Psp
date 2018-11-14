/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5;

/**
 *
 * @author Gonzalo
 */
public class Hilo extends Thread {
        
    private String nombre;

    public Hilo(String rNombre) {
        nombre = rNombre;
    }

    @Override public void run() {
        
        
        System.out.println("Ola, son o " + nombre);

    }
}
