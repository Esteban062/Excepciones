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
public class excepcionpropia {
    public static void main (String[] args){
String user,pass, repass;

user="esteban";
pass="12345678";
repass="12345678es";

Mihelper h  = new Mihelper();

try{
    h.validarPassword(pass,repass);
    
    
}catch(CustomException e){
    System.out.println("No se puede registrar el usuario"+ e);
    
}
    

    }
}
