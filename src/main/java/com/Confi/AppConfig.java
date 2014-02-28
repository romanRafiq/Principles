/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Confi;

import com.MyInterface.Encapsulation.Person;
import com.MyInterface.Inheritance.Player;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author student
 */
public class AppConfig {
     
    @Bean(name = "InheritanceClass")
    public Person getFirstClass()
    {
        return new Player();
    }
    
}
