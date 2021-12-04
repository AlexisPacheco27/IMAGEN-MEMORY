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

//En esta clase solo generamos aleatorios para evitar que las preguntas se repitan al momento de jugar
public class Aleatorios extends Thread{
   int cont=0,ale=0,aux=0; 
   Preguntas preguntas = new Preguntas();
   
   public void run(){
    
    while(cont < 5){
     
        ale = (int) (Math.random() * 29);
        if(ale!=aux){
        preguntas.aleatorios[cont] = ale;
        aux = ale;
        cont++;
        }
        
    }
    
    this.stop();
    
   }  
    
}
