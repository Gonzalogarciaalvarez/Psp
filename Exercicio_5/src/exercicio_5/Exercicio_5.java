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
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Hilo h1 = new Hilo("fio1");
        Hilo h2 = new Hilo("fio2");
        
        h1.setPriority(1);
        h2.setPriority(10);
        
        h2.start();
        h1.start();        
        
        try {
            // Tiempo para dormir
            h1.join(10);
        } catch (InterruptedException ex) {}
    }
    
    }
    