/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.List;

/**
 *
 * @author usuario
 */
public interface PersonaDao {
    Persona nueva(Persona p);
    List<Persona> todos();
}
