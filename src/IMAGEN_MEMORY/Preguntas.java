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

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * EN esta clase definiremos las preguntas, imagenes y respuestas con las se van
 * a trabajar, se utilizan arreglos y listas
 */
public class Preguntas {
    public static int []aleatorios = new int[5]; // alamacenara aleatorios
    
    public static int contadorImagenes = 0; // posicion actual de la lista de imagenes
    public static int contadorPreguntas = 0;// posicion actual de la lista de preguntas
    public static int contadorRespuestas = 0;// posicion actual de la lista de respuestas

    public static int contador = 0;// cuantas veces va ejecutando 
    public static int contadorposcionpreg = 0;//indice de referencia para alamacenar la pregunta
    public static int contadorposicionresp= 0;// indice de referencia para almacenar la respuesta
    
    public final int limite = 5; // contante que indica el numero de imagenes maximas que mostrara el juego 

    public static int[] array;// almacenamos las respuestas del txt para despues comparar con las del juego
    public static int [] elegidas= new int[10];// para almacenar la pregunta y la repuesta seleccionadas en el juego

    public String AbrirArchivo(String ruta) { // la funcion es implementada para abrir los archivos de texto que se encuentran dentro de la misma carpeta del proyecto
        String doc;
        String documento = "";
        try {
            FileReader fr = new FileReader(ruta); // cargara el archivo que encuentre en la ruta que se especifique 
            BufferedReader br = new BufferedReader(fr); // leera el archivo cargado en el buffer 

            while ((doc = br.readLine()) != null) { //leera linea por linea del documento hasta encontrar el EOL
                documento = documento + doc + "-"; // concatenamos la cadena leida en la linea en una variable que se ocupara posteriormente
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo " + e);
        }

        return documento;
    }

    public String[] preguntas() {// funcion para declarar la el arreglo con las preguntas 

        String ruta = "C:\\Users\\Alexis Pacheco\\Documents\\NetBeansProjects\\IMAGEN MEMORY\\src\\TXTs\\Preguntas.txt"; // especificamos el nombre del archivo que abriremos, no es necesario especificar ruta ya que por default busca en la carpeta del proyecto
        String[] pregunta1; // declaramos un arreglo que amacenara las preguntas una vez separadas con el split
        String doc; // alamacenara la cadena completa devuelta por la funcion de AbrirArchivo
        doc = AbrirArchivo(ruta);
        pregunta1 = doc.split("-"); // separamos la cadena con la funcion split

        return pregunta1; // retornaremos el arreglo resultante con las preguntas 
    }

    public int[] correctas() { // funcion para declarar el arreglo de respuestas correctas 

        String ruta = "C:\\Users\\Alexis Pacheco\\Documents\\NetBeansProjects\\IMAGEN MEMORY\\src\\TXTs\\Respuestas.txt";
        String[] respuestas;
        
        String doc;
        doc = AbrirArchivo(ruta);
        respuestas = doc.split("-");
        int []enteros= new int [respuestas.length];// creamos un arreglo de enteros de tamaño igual al de respuestas        
        for(int i=0;i<respuestas.length;i++){ // en el ciclo convertiremos cada respuestas del txt en numeros enteros para su comparacion posterior
        
        enteros[i]=Integer.parseInt(respuestas[i]);     
            
        }
        
        
        return enteros;
    }
    
    public String[] respuestas() { // funcion para declarar el arreglo de posibles respuestas 

        String ruta = "C:\\Users\\Alexis Pacheco\\Documents\\NetBeansProjects\\IMAGEN MEMORY\\src\\TXTs\\PRespuestas.txt";
        String[] respuestas;
        String doc;
        doc = AbrirArchivo(ruta);
        respuestas = doc.split("-");

        return respuestas;
    }
    
    public ArrayList<ImageIcon> Imagenes() { // funcion para declarar la lista de imagenes que retorna una lista para usar posteriormente

        ArrayList<ImageIcon> listaImagenes = new ArrayList<ImageIcon>(); // declaracion de lista de imagenes

        // creacion del objeto que contendra la imagen 
        ImageIcon imag0 = new ImageIcon(getClass().getResource("/Imagenes/0.png"));
        ImageIcon imag1 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
        ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
        ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
        ImageIcon imag4 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
        ImageIcon imag5 = new ImageIcon(getClass().getResource("/Imagenes/5.png"));
        ImageIcon imag6 = new ImageIcon(getClass().getResource("/Imagenes/6.png"));
        ImageIcon imag7 = new ImageIcon(getClass().getResource("/Imagenes/7.png"));
        ImageIcon imag8 = new ImageIcon(getClass().getResource("/Imagenes/8.png"));
        ImageIcon imag9 = new ImageIcon(getClass().getResource("/Imagenes/9.png"));
        ImageIcon imag10 = new ImageIcon(getClass().getResource("/Imagenes/10.png"));
        ImageIcon imag11 = new ImageIcon(getClass().getResource("/Imagenes/11.png"));
        ImageIcon imag12 = new ImageIcon(getClass().getResource("/Imagenes/12.png"));
        ImageIcon imag13 = new ImageIcon(getClass().getResource("/Imagenes/13.png"));
        ImageIcon imag14 = new ImageIcon(getClass().getResource("/Imagenes/14.png"));
        ImageIcon imag15 = new ImageIcon(getClass().getResource("/Imagenes/15.png"));
        ImageIcon imag16 = new ImageIcon(getClass().getResource("/Imagenes/16.png"));
        ImageIcon imag17 = new ImageIcon(getClass().getResource("/Imagenes/17.png"));
        ImageIcon imag18 = new ImageIcon(getClass().getResource("/Imagenes/18.png"));
        ImageIcon imag19 = new ImageIcon(getClass().getResource("/Imagenes/19.png"));
        ImageIcon imag20 = new ImageIcon(getClass().getResource("/Imagenes/20.png"));
        ImageIcon imag21 = new ImageIcon(getClass().getResource("/Imagenes/21.png"));
        ImageIcon imag22 = new ImageIcon(getClass().getResource("/Imagenes/22.png"));
        ImageIcon imag23 = new ImageIcon(getClass().getResource("/Imagenes/23.png"));
        ImageIcon imag24 = new ImageIcon(getClass().getResource("/Imagenes/24.png"));
        ImageIcon imag25 = new ImageIcon(getClass().getResource("/Imagenes/25.png"));
        ImageIcon imag26 = new ImageIcon(getClass().getResource("/Imagenes/26.png"));
        ImageIcon imag27 = new ImageIcon(getClass().getResource("/Imagenes/27.png"));
        ImageIcon imag28 = new ImageIcon(getClass().getResource("/Imagenes/28.png"));
        ImageIcon imag29 = new ImageIcon(getClass().getResource("/Imagenes/29.png"));
        
//         agregar imagen a lista  
        listaImagenes.add(imag0);
        listaImagenes.add(imag1);
        listaImagenes.add(imag2);
        listaImagenes.add(imag3);
        listaImagenes.add(imag4);
        listaImagenes.add(imag5);
        listaImagenes.add(imag6);
        listaImagenes.add(imag7);
        listaImagenes.add(imag8);
        listaImagenes.add(imag9);
        listaImagenes.add(imag10);
        listaImagenes.add(imag11);
        listaImagenes.add(imag12);
        listaImagenes.add(imag13);
        listaImagenes.add(imag14);
        listaImagenes.add(imag15);
        listaImagenes.add(imag16);
        listaImagenes.add(imag17);
        listaImagenes.add(imag18);
        listaImagenes.add(imag19);
        listaImagenes.add(imag20);
        listaImagenes.add(imag21);
        listaImagenes.add(imag22);
        listaImagenes.add(imag23);
        listaImagenes.add(imag24);
        listaImagenes.add(imag25);
        listaImagenes.add(imag26);
        listaImagenes.add(imag27);
        listaImagenes.add(imag28);
        listaImagenes.add(imag29);
        

        return listaImagenes;
    }

    
    
    
    
}
