/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5b;

/**
 *
 * @author Gonzalo
 */
public class Exercicio_5b extends Thread{

    /**
     * @param args the command line arguments
     */
    
    public Exercicio_5b(String nom) {
        super(nom);
    }
    
    public static void main(String[] args) {
        //Creamos los threads
       Thread t1 = new Exercicio_5b("Thread1");
       Thread t2 = new Exercicio_5b("Thread2");
       //Establecemos sus prioridades
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t2.start();
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<=0; i++){
            System.out.println("Hola, soy el Thread " + getName());
        }
    }
    }
    

