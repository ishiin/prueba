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
public class FactoriaLoginDao {
    private static final LoginDao DAO = new BdEnMemoria();
    public static LoginDao get(){
        return DAO;
    }
    
}
