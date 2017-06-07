/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
import static org.apache.commons.lang3.RandomStringUtils.*;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu = 0;
        int lectorId = 0;
        String lectorNombre = "";
        Scanner scan = new Scanner(System.in);
        
        while(menu!=3) {
            System.out.println("Que quieres hacer?");
            System.out.println("1) Añadir una persona");
            System.out.println("2) Mostrar todas las personas");
            System.out.println("3) Salir de la aplicacion");
            menu = scan.nextInt();

            switch(menu) {
                case 1:
                    System.out.println("Introduce la ID de la persona: ");
                    lectorId = scan.nextInt();
                    System.out.println("Introduce el nombre de la persona: ");
                    lectorNombre = scan.next();
                    Persona p = new Persona(Long.valueOf(lectorId), lectorNombre);
                    FactoriaPersonaDao.get().nueva(p);
                    break;
                case 2:
                    FactoriaPersonaDao.get().todos().forEach(out::println);
                    break;
                case 3:
                    System.exit(0); 
            }
        }
    }

}
