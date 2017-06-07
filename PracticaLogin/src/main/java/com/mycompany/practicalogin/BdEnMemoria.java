/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalogin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author spino
 */
public class BdEnMemoria implements LoginDao{
    private final List<Login> logins;

    BdEnMemoria() {
        this.logins = new ArrayList<>();
    }

    @Override
    public Login nuevo(Login log) {
        Objects.requireNonNull(log);
        log.setClave("1234");
        logins.add(log);
        return log;
    }

    @Override
    public List<Login> todos() {
        return Collections.unmodifiableList(logins);
    }
}
