/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo
 */
public class Banco {
    
     //Hacemos que el banco comience con algo de dinero
    int dinero = 50;

    //Booleans que nos permiten recoger y colocar
    static boolean recoger = true, colocar = true;

    //Con getDinero recogemos dinero
    public synchronized int getDinero() {
        //Mientras que no puedas recoger, puedes ingresar
        while (recoger == false) {
            try {
                //Igualas colocar a true para que el hilo ingresos pueda insertar dinero
                colocar = true;
                //El hilo extracciones espera a que termine el hilo ingresos
                wait();
            } catch (Exception ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Si el dinero es negativo no retiramos, introducimos dinero
        if (dinero <= 0) {
            recoger = false;
            colocar = true;
        }
        //Una vez se haya ejecutado la sentencia de recoger dinero notifica de que el hilo a finalizado su ejecucion
        notify();

        return dinero;
    }

    //Le pasamos por parametro el dinero introducido
    public synchronized void setDinero(int saldo) {
        try {
            //Mientras que no podamos colocar, podemos recoger
            while (colocar == false) {
                //Igualamos recoger a true para que el hilo consumidor pueda recoger dinero
                recoger = true;
                //El hilo ingresos espera al hilo extracciones
                wait();

            }
            //A la variable dinero le asignamos 'saldo' que es el dinero que introducimos / retiramos
            dinero = saldo;        
            //Una vez se haya ejecutado la sentencia de ingresar dinero notifica de que el hilo a finalizado su ejecucion
            notify();

        } catch (Exception ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
