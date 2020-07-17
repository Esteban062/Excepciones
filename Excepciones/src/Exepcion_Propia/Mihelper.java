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
public class Mihelper {
    public Mihelper(){
        
    }
    public void  validarPassword(String pass, String repass) throws CustomException{
        if(!pass.equals(repass) ){
            throw new CustomException("Los campos de la password no coinside");
            
        }
        
if (pass.length()<8){
    throw new CustomException ("El password no puede ser menor a 8 caracteres");
}    
    
}
}
