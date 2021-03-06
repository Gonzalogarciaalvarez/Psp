/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_1;

/**
 *
 * @author Gonzalo
 */
public class Hilo extends Thread{
        
    private final String nombre;
    private final int tiempo;
    
    public Hilo(String nombre, int tiempo){
        
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.start();
    }
    
    @Override public void run() {

        for(int i = 0; i < 10; i++){
            
            System.out.println(i + " - " + nombre);
            
            try {
                Thread.sleep((long) (Math.random() * tiempo + 100));
            } catch (InterruptedException ex) {}
        }
    }
}
