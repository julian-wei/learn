package com.wj.util.jwt;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.wj.controller.JsonResource;
import com.wj.util.jwt.filters.JWTAuthFilter;
import com.wj.util.jwt.filters.JWTResponseFilter;

/**
 *
 * Specific to /resources/book
 */
@ApplicationPath("res")
public class JAXRSConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> clazzes = new HashSet();
        clazzes.add(JWTAuthFilter.class);
        clazzes.add(JsonResource.class);
        clazzes.add(JWTResponseFilter.class);

        return clazzes;
    }
}
