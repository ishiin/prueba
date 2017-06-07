/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalogin;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
import static org.apache.commons.lang3.RandomStringUtils.*;

/**
 *
 * @author spino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrays.asList("manolo","paco","francisco").stream().map(log -> new Login(log))
                .forEach(login -> FactoriaLoginDao.get().nuevo(login));
        FactoriaLoginDao.get().todos().forEach(out::println);
        
        String entry = "";
        Scanner scan = new Scanner(System.in);
        Login user = new Login();
        
        System.out.println("Introduce usuario: ");
        entry = scan.next();
        user.setNombre(entry);
        System.out.println("Introduce clave: ");
        entry = scan.next();
        user.setClave(entry);
        
    }
    
}
