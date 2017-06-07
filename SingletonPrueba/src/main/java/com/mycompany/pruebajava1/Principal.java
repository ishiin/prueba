/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebajava1;

import static com.mycompany.pruebajava1.ClaseSingleton.getSingletonInstance;

/**
 *
 * @author spino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseSingleton single1 = getSingletonInstance();
        ClaseSingleton single2 = getSingletonInstance();
        ClaseSingleton single3 = single1.clone();
    }

}
