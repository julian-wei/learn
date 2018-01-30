package com.wj.util.jwt;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.wj.controller.Login;

/**
 *
 * specific to /auth/token
 */
@ApplicationPath("auth")
public class ProtectedJAXRSConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> clazzes = new HashSet();
        clazzes.add(Login.class);

        return clazzes;
        //return super.getClasses(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
