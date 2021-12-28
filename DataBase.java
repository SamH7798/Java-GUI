/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samsjavagui;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;



/**
 *
 * @author samhi
 */
public class DataBase {
      public static Map<String, String> Users = new HashMap<String, String>(); // global map of users and their passwords
      public static Vector<Employee> Employees = new Vector<Employee>(); // vector of current employees
      public static Vector<Supervisor> Supervisors = new Vector<Supervisor>(); // vector of current supervisors
      
      
   
    public static void insertUser(String username, String password){
    Users.put(username, password);
    
    }
    
}
