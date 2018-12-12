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
public class Ingresos extends Thread{
    //b es un objeto de tipo banco sin instanciar
    Banco b;
    int ingreso;

    //A la variable b le asignamos el objeto que recogemos del main
    public Ingresos(Banco bb) {
        this.b = bb;
    }

    public void run() {
        //Bucle for que ingresa dinero 10 veces
        for (int i = 0; i < 10; i++) {
            //La cantidad que ingresamos es un numero random entre 1 y 50
            ingreso = (int) (Math.random() * 50 + 1);
            
            //Hacemos el ingreso, para ello recogemos el dinero que hay ya ingresado y le sumamos lo que ingresamos
            b.setDinero(b.getDinero()+ingreso);
            //Mostramos el dinero que ingresamos
            System.out.println("Dinero introducido: "+ingreso);
            //Mostramos el dinero total
            System.out.println("Dinero total: "+b.getDinero());
        }
    }
}
