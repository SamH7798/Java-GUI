/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samsjavagui;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samhi
 */
public class Supervisor {
    
    Supervisor(){
    firstName_ = "";
    lastName_ = "";
    userName_ = "";
    password_="";
    id_="";
    role_="";
    }
    
    
    Supervisor(String firstName, String lastName, String userName,  String password, String id, String role){
     
     firstName_ = firstName;
     lastName_ = lastName;
     userName_ = userName;
     password_ = password;
     id_ = id;
     role_ = role;
     
    }
    
    String getUserName(){
        return userName_;
    }
    
    String getRole(){
        return role_;
    }
    
    void addEmployee(Employee e){
        supervisedEmployees_.put(e.getID(), e.getFirstName() + " " + e.getLastName());
    }
    
     void populateJTable(JTable clientTable){                  // popluates the jTable with client information
        DefaultTableModel model = (DefaultTableModel)clientTable.getModel();
        model.getDataVector().removeAllElements();
        for(Map.Entry<String, String> entry : supervisedEmployees_.entrySet()){
            model.addRow(new Object[]{entry.getKey(),entry.getValue()});
        }
        
    }
    
    private String firstName_;
    private String lastName_;
    private String userName_;
    private String password_;
    private String id_;
    private String role_;
   
    
    private Map<String, String>supervisedEmployees_ = new HashMap();  // Hashmap of Employees supervised with the Employee Name and Employee ID
    
}
