/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMAGEN_MEMORY;

import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author IMAGEN MEMORY
 */
public class Tiempo extends Thread {
/*Esta clase solo se implementa para mostrar un cronometro en la ventana del visor de imagenes 
    su funcion solo es mostrar el tiempo que resta para que se cierre la ventana
    
    */
    javax.swing.JLabel jLabel1;  // creamos un label para insertar el cronometro

    int milesimas = 0;
    int segundos = 6; 
    private JLabel jLabell;

    public void run() {

        while (segundos >=0) {
            try {
                Thread.sleep(5);
                milesimas += 5;
                if (milesimas == 1000) {
                    
                    jLabell.setText(String.valueOf(segundos));
                    segundos--;
                    milesimas = 0;
                }

            } catch (Exception e) {
            }

        }
    }

    
    
    
    public void Contador(javax.swing.JLabel etiqueta) {

        this.jLabell = etiqueta;
    }

}
