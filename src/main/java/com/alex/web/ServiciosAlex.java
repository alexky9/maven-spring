

package com.alex.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosAlex {
    
    @Bean
    Persona ejecutargracia(){
        
        return new CuentaChistes();
    }
    
}
