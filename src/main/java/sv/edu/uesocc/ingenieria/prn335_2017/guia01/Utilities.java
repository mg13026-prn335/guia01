/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author usuario
 */
public class Utilities {
    
     /**
     * 
     * @param texto "cadena de texto  que contiene el titulo de un determinado post"
     * @return " el texto que se ha recibido  con cada palabara capitalizada  y sin dobles "
     * 
     */
    public String getResume(String texto){
    
    String salida = "";
   if (texto.length() > 30){
   for ( int i=0; i<30 ; i++){
   salida += String.valueOf(texto.charAt(i));
   }
   
   }else{
       salida = texto; 
               }
            
   return salida; 
    }
    
    
    /**
     * 
     * @param texto
     * @return 
     */
    public String capitalizar(String texto){
   String salida;
   texto = texto.replaceAll("", "");
   salida =String.valueOf(texto.charAt(0)).toUpperCase();
           
   
    for( int i  = 1; i < texto.length();i++){
  // if (texto.charAt(i - 1) == ){
   
   
   
   
   }
   
   return;
   
   }
        
        
        
        
        
        
        
        
    
    
    
    
    
    public int contarCoincidencias(String frase, String texto){
    
    
    return;
    }
    
}


