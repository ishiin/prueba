/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalogin;

/**
 *
 * @author spino
 */
public class Login {
    private String nombre;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public Login() {
        
    }
    public Login(String nombre) {
        this.nombre=nombre;
    }
    public Login(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Login{" + "nombre=" + nombre + ", clave=" + clave + '}';
    }
}
