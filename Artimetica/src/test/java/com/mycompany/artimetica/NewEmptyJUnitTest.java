/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artimetica;

import com.mycompany.aritmetica.Artimetica;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spino
 */
public class NewEmptyJUnitTest {
    
    Artimetica ar;
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test (expected = IllegalArgumentException.class)
    public void listaNula() {
        ar = new Artimetica();
        System.out.println("Media con lista nula");
        assertNotNull(ar.media(null));
    }
    @Test (expected = IllegalArgumentException.class)
    public void listaVacia() {
        ar = new Artimetica();
        System.out.println("Media con la lista sin valores");
        List<Double> numeros = new ArrayList<>();
        ar.media(numeros);
    }
    @Test (expected = RuntimeException.class)
    public void listaNegativa() {
        ar = new Artimetica();
        System.out.println("Media con valores negativos");
        List<Double> numeros = Arrays.asList(1.0, -1.0);
        ar.media(numeros);
    }
    @Test
    public void todoCorrecto() {
        ar = new Artimetica();
        System.out.println("Media con valores correctos");
        List<Double> numeros = Arrays.asList(2.0, 2.0, 2.0);
        Double expResult = 2.0;
        Double result = ar.media(numeros);
        assertEquals(expResult, result);
    }
}
