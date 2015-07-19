/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.securitylogin.repo;

import com.mycompany.securitylogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Best
 */
public interface UserRepo extends JpaRepository<User,Integer>{
    
    public User findByUsername(String username);
}
