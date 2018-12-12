/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_6;

/**
 *
 * @author Gonzalo
 */
public class Extracciones extends Thread{
    //b es un objeto de tipo banco sin instanciar
    Banco b;
    int quitar;
    
    //A la variable b le asignamos el objeto que recogemos del main 
    public Extracciones(Banco bb){
    this.b = bb;
    }
    
    public void run(){
    
        for (int i = 0; i < 5; i++) {
            //La cantidad que retiramos es un numero random entre 1 y 50
            quitar = (int) (Math.random() * 50 + 1);
            //Hacemos el retiro, para ello recogemos el dinero que hay ya ingresado y le restamos lo que retiramos 
            b.setDinero(b.getDinero()-quitar);
            //Mostramos el dinero que quitamos
            System.out.println("Dinero retirado: "+quitar);
            //Mostramos el dinero total
            System.out.println("Total en el banco: "+b.getDinero());
        }
    }
}
