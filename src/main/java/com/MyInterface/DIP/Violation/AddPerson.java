/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyInterface.DIP.Violation;

import com.MyInterface.Encapsulation.Person;
import com.MyInterface.Inheritance.Player;

/**
 *
 * @author 211072478
 */
public class AddPerson {
    
    private Person person;
    
    public void AddingPerson(String fName, String lName, String contactNumber, String idNumber, int age)
    {
        person = new Person( fName,  lName,  contactNumber,  idNumber,age);
        
    }
    
}
