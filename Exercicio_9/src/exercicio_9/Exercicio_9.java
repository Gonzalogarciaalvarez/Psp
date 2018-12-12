/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_9;

/**
 *
 * @author Gonzalo
 */
public class Exercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creamos el objeto ascensor para mandarselo a cada piso
       Ascensor a = new Ascensor();
       //Creamos los objetos tipo piso y les pasamos el numero de piso, el destino de la persona,el nombre de la persona y el objeto de tipo ascensor
       Piso p4= new Piso(4, 18,"Jorge",a);
       Piso p0 = new Piso(0, 4, "Gon",a);
       Piso p19 = new Piso(19, 11,"Ruben",a);
       //Iniciamos todos los hilos
       p4.start();
       p0.start();
       p19.start();
    }
    
}
