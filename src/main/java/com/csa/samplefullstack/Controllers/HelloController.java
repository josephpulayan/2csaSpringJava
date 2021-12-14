/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.Controllers;

import org.springframework.web.bind.annotation.*;


/**
 *
 * @author User
 */

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")   // allows different (all if "*" is used) requests
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello there";
    }
}

