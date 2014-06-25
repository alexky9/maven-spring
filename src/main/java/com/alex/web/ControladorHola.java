
package com.alex.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/Hola")
public class ControladorHola {
    
    @RequestMapping(value="/Mensaje",method=RequestMethod.GET,headers={"Accept=text/html"})
    
    public @ResponseBody String algo(){
        String facil="Mi primer servio en java con REST y Spring";
        return facil;
        
    }
    
    @RequestMapping(value="/usuario", method=RequestMethod.GET,headers = {"Accept=Application/json"})
    
    @ResponseBody String mijson(){
        
        ObjectMapper mapeadorjson=new ObjectMapper();
        
        return null;
    }
    
}
