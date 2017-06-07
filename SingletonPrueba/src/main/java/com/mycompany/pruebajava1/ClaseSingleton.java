/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebajava1;

/**
 *
 * @author spino
 */

public class ClaseSingleton {
    
    private static ClaseSingleton instance = null;

    private ClaseSingleton() {
    }
    
    public static ClaseSingleton getSingletonInstance() {
       if (instance==null) {
           instance = new ClaseSingleton();
           System.out.println("Instancia creada");
       }else{
           System.out.println("Ya existe una instancia de esta clase");
       }
       return instance;
    }
    
    @Override
    public ClaseSingleton clone() {
        try{
            throw new CloneNotSupportedException();
        }catch (CloneNotSupportedException e){
            System.out.println("No puedes clonar esta clase porque es unica");
        }
        
        return null;
    }
}
