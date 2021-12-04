/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMAGEN_MEMORY;

/**
 *
 * @author IMAGEN MEMORY
 */
public class HiloPreguntas extends Thread {
/*
Este hilo tiene la funcion de mostrar la pregunta segun sea el indice de referencia que le mandemos 
*/
    
    //Creamos la instancia de las clases que utilizaremos
    Preguntas imagenes = new Preguntas();
    javax.swing.JLabel jLabel1;
    
    String[] lista; // preparamos el arreglo para recibir el que devuelve la funcion
   
    public void run() {

        try {

            lista = imagenes.preguntas(); // igualamos el arreglo a la funcion
            imagenes.contadorPreguntas= imagenes.contadorImagenes;// tomamos como referencia el contadorimagenes y lo almacenamos en el contador preguntas 

            jLabel1.setText(lista[imagenes.contadorPreguntas]); // le enviamos la pregunta que esta en la posicion del indice contador preguntas

        } catch (Exception e) {
        }

    }

    public void recibejLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

}
