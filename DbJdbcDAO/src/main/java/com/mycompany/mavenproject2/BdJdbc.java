/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import static java.lang.Math.toIntExact;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author spino
 */
public class BdJdbc implements PersonaDao{
    
    private final List<Persona> personas;
    
    BdJdbc() {
        this.personas = new ArrayList<>();
    }

    @Override
    public Persona nueva(Persona p) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/curso", "app","app");
            
            PreparedStatement storedP = con.prepareCall("INSERT INTO personas VALUES(?,?)");
            storedP.setInt(1, toIntExact(p.getId()));
            storedP.setString(2, p.getNombre());
            storedP.executeUpdate();
            con.close();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return p;
    }

    @Override
    public List<Persona> todos() {
    
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/curso", "app","app");
            
            PreparedStatement storedP = con.prepareCall("SELECT * FROM personas");
            ResultSet rset = storedP.executeQuery();
            personas.clear();
            while(rset.next()) {
                Persona p = new Persona();
                p.setId(Long.valueOf(rset.getInt(1)));
                p.setNombre(rset.getString(2));
                personas.add(p);
            }
            con.close();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        
        return Collections.unmodifiableList(personas);
    }
    
}
