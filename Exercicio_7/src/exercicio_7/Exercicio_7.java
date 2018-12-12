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
public class Exercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objeto buzon y se lo mandamos a los hilos
        Buzon b = new Buzon();
        //Creamos los hilos de cada escritor y les pasamos el objeto Buzon, el numero de hilo y el mensaje que deben escribir
        Escritores e1 = new Escritores(b, 1, "Mensaje de hilo 1");
        Escritores e2 = new Escritores(b, 2, "Mensaje de hilo 2");
        Escritores e3 = new Escritores(b, 3, "Mensaje de hilo 3");
        //Creamos los hilos de cada lector y les pasamos el objeto y el numero de hilo
        Lectores lec1 = new Lectores(b, 1);
        Lectores lec2 = new Lectores(b, 2);
        Lectores lec3 = new Lectores(b, 3);
        //Iniciamos los hilos de los escritores
        e1.start();
        e2.start();
        e3.start();
        //Iniciamos los hilos de los lectores
        lec1.start();
        lec2.start();
        lec3.start();

    }
    }