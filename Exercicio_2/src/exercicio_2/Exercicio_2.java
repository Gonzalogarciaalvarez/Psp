/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

/**
 *
 * @author Gonzalo
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");
        Hilo hilo4 = new Hilo("Hilo 4");
        
        while(hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive()){
            
        }
        System.out.print(hilo1.getState());
    }
        
    }
    