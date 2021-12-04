/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMAGEN_MEMORY;

import java.util.ArrayList;

/**
 *
 * @author IMAGEN MEMORY
 */
public class HiloRespuestas extends Thread {

    Preguntas imagenes = new Preguntas();
    /*
    Este hilo mostrara las opciones de respuesta a la pregunta, su funcionamiento se basa en recorrer el 
    arreglo de las posibles respuestas y mostrarlo en la interfaz mediante el paso de los label
     */
    javax.swing.JButton jButon1;
    javax.swing.JButton jButon2;
    javax.swing.JButton jButon3;

    String[] lista; // preparamos un arreglo para recibirlo de la funcion de respuestas 

    public void run() {

        try {

            lista = imagenes.respuestas(); // igualamos el arreglo de esta clase con el que devuelve la funcion 
            if (imagenes.contadorImagenes == 0) {// verificamos si el contador es igual a0 entonces solo sumaremos
                /*la suma se hace para obtener las primeras 3 posiciones del arreglo ya que esas corresponden a la imagen en la posicion 0 (en la lista de imagenes)
                y a la pregunta 0 (en el arreglo de preguntas) */
                Preguntas.contadorRespuestas = 0;

                jButon1.setText(lista[imagenes.contadorRespuestas]);
                jButon2.setText(lista[imagenes.contadorRespuestas + 1]);
                jButon3.setText(lista[imagenes.contadorRespuestas + 2]);

            } else {
                /*en este caso si el contador es diferente de 0 procedemos a hacer una multiplicacion para obtener el indice
                de las opciones de respuesta que corresponde a la pregunta 
                
                ejemplo:
                
                se genera un 4 como aleatorio
                
                -se mostrara la imagen que se encuentra en la posicion 4 de la lista de imagenes
                -se mostrara la pregunta que se encuentra en la posicion 4 del arreglo de preguntas
                - y por ultimo se mostraran las tres opciones apartir del indice 12 del arreglo de posibles respuestas 
                
                 */
                imagenes.contadorRespuestas = imagenes.contadorImagenes * 3; // el contador de imagenes es el valor de referencia 
//                puesto que ahi se guarda directamente el numero aleatorio
////                generado 
                jButon1.setText(lista[imagenes.contadorRespuestas]);
                jButon2.setText(lista[imagenes.contadorRespuestas + 1]);
                jButon3.setText(lista[imagenes.contadorRespuestas + 2]);

                /*
                -----NOTA------
 
                No se actualizan los contadores puesto que solo los utilizamos como referencia para saber en que posicion
                se encutra en cada arreglo
                el unico importante es el contador de ejecucion
                 */
            }

        } catch (Exception e) {
        }

    }

    public void recibejLabell(javax.swing.JButton jButon1, javax.swing.JButton jButon2, javax.swing.JButton jButon3) {
        this.jButon1 = jButon1;
        this.jButon2 = jButon2;
        this.jButon3 = jButon3;
    }

}
