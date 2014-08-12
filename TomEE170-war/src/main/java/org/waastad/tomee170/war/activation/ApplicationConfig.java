/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.tomee170.war.activation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.waastad.tomee170.war.service.GoodByeService;
import org.waastad.tomee170.war.service.HelloService;

/**
 *
 * @author helge
 */
@ApplicationPath("/")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>(Arrays.asList(HelloService.class, GoodByeService.class));
    }

}
