/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_7;

/**
 *
 * @author Gonzalo
 */
public class Lectores extends Thread {

    //b Es el objeto de tipo buzon
    Buzon b;
    //numeroHilo es el numero de hilo que escribe
    int numeroHilo;
    
    //Constructor con parametros
    public Lectores(Buzon b, int numeroHilo) {
        this.b = b;
        this.numeroHilo = numeroHilo;
    }

    public void run() {
        //Mostramos el hilo que está leyendo y el mensaje que lee
        System.out.println("Lee el hilo " + numeroHilo + ": " + b.getMensaje());
    }
    
}
