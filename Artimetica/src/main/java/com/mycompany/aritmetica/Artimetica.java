/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aritmetica;

import java.util.List;

/**
 *
 * @author spino
 */
public class Artimetica {
    
    private Double numeros;
    
    public Double media(List<Double> numeros) {
      if (numeros == null) {
            throw new IllegalArgumentException("La lista es nula");
        }
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía");
        }        
        if (numeros.stream().filter(n -> n < 0).count() != 0) {
            throw new RuntimeException("La lista tiene valores negativos");
        }
        return numeros
                .stream()
                .reduce(0.0, (a, b) -> a + b) / numeros.size();
    }  
}
