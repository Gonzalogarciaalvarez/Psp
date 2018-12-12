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
public class Exercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el objeto banco
        Banco b = new Banco();
        
        //Les pasamos el objeto b para que accededan a los metodos
        Extracciones c = new Extracciones(b);
        Ingresos p = new Ingresos(b);
        
        p.start();
        c.start();
    }
    
}
