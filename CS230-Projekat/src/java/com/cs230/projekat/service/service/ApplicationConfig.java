/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs230.projekat.service.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author darko
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.cs230.projekat.CrossOriginResourceSharingFilter.class);
        resources.add(com.cs230.projekat.NewCrossOriginResourceSharingFilter.class);
        resources.add(com.cs230.projekat.service.service.AuthorFacadeREST.class);
        resources.add(com.cs230.projekat.service.service.BookFacadeREST.class);
        resources.add(com.cs230.projekat.service.service.RentalFacadeREST.class);
        resources.add(com.cs230.projekat.service.service.UserFacadeREST.class);
    }
    
}
