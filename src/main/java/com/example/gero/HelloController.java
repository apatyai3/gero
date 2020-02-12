package com.example.gero;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @RequestMapping(value="/")
    public ModelAndView  top(ModelAndView mav){
    	mav.setViewName("top");
        return mav;
    }
    
    
}