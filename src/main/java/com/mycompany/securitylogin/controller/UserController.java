/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.securitylogin.controller;

import java.util.Collections;
import java.util.Map;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Best
 */
@Controller
public class UserController {
    @RequestMapping("/test") 
    @PreAuthorize("hasRole('ADMIN')")
    @ResponseBody
    public Map hello(){
     return Collections.emptyMap();
     }
}
