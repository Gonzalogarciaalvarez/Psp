/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo
 */
public class Buzon {
    //Mensaje que leen los lectores y escriben los escritores
    String mensaje = "";
    //Boolean que dice si hay mensaje o no
    boolean hayMensaje = false;
    
    public synchronized void setMensaje(String mensaje){
        //Mientras que haya mensaje, el hilo espera
        while(hayMensaje){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Le asignamos el mensaje que le mandamos a la variable mensaje.
        this.mensaje = mensaje;
        //Confirmamos que hay un mensaje para leer
        hayMensaje = true;
    }
    
    public synchronized String getMensaje(){
        //Mientras que no haya mensaje, el hilo espera
        while(!hayMensaje){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Una vez recibe el mensaje notifica de que ha leido el mensaje y cambia la variable hayMensaje a false
        notify();
        hayMensaje = false;
        //Devuelve el mensaje
        return mensaje;
    }
}
