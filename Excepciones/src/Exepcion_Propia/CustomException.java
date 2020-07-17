/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepcion_Propia;

/**
 *
 * @author quiro
 */
public class CustomException extends Exception {
   /* Programar  el codigo fuente que se debe ejecutar cuando el catch se activa 
    son operacion porpias*/
    
    public static final long serialVersionUID = 700L;
    
    public CustomException (String mensaje){
        super(mensaje);
        
    }
    
}
