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
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class HiloImagenes extends Thread {

    /*
    Este hilo tiene la finalidad de mostrar las imagenes segun el indice que se le indique con el numero 
    aleatorio que se genera
     */

// creamos las instancias a las clases que ocuparemos
    Preguntas imagenes = new Preguntas();
    javax.swing.JLabel jLabel1;
    int numero = 0;
    Preguntas preguntas = new Preguntas();
    ArrayList<ImageIcon> lista = new ArrayList<ImageIcon>(); // preparamos una arreglo de listas para recibir el que que devuelve la funcion

    public void recibejLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void run() {

        try {

            lista = imagenes.Imagenes(); // igualamos la lista que creamos con la funcion que regresa la lista de imagenes que vamos a mostrar

//           
            imagenes.contadorImagenes = preguntas.aleatorios[imagenes.contador];// generemos el aleatorio y lo guardamos en la variable contador de imagenes para tenerlos como referencia
            /*
           esta linea lista.get(imagenes.contadorImagenes) nos muestra la imagen que se encuentra en el indice que le indicamos 
           en este caso es el numero aleatorio alamacenado en la variable de contador imagen
           
           Y esta linea .getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT) lo unico que hace
           es ajustar la imagen al tamaño del label 
             */
            ImageIcon imageIcon1 = new ImageIcon(lista.get(imagenes.contadorImagenes).getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));

            jLabel1.setIcon(imageIcon1);
            imagenes.contador++; // aumentamos el contador en 1 para llevar el control de numero de ejecuciones
        } catch (Exception e) {
        }

    }

}
