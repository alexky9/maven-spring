

package com.alex.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProbarPersonas {

    public static void main(String[] args) {
        
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ServiciosAlex.class);
        Persona p=ctx.getBean(Persona.class);
        System.out.println(p.ejecutargracia());
    }
    
}
