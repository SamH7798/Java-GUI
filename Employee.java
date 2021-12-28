/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samsjavagui;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samhi
 */
public class Employee {
    
    Employee(){
    firstName_ = "";
    lastName_ = "";
    username_ = "";
    password_ = "";
    id_ = "";
    role_ = "";
    }
    
    Employee(String firstName, String lastName, String username, String password, String id, String role){
    firstName_ = firstName;
    lastName_ = lastName;
    username_ = username;
    password_ = password;
    id_ = id;
    role_ = role;
    }
    
    String getUsername(){
        return username_;
    }
    String getRole(){ // returns rold
        return role_;
    }
    String getPassword(){ // returns password
        return password_;
    }
    String getFirstName(){
        return firstName_;
    }
    
     String getLastName(){
        return lastName_;
    }
     String getID(){
         return id_;
     }
    void addClient(String clientID, String clientName){ // adds a client in the private hashmap
        clients_.put(clientID, clientName);
    }
   
    void removeClient(String clientID, JTable clientTable){
    clients_.remove(clientID); // removes from client hashtable
    this.populateJTable(clientTable); // populates the table with the client removed
    }
    /*
    Map<String, String> copyClients(Map<String, String> Copy){ // copys the clients into a hashmap so we can use the private hashmap 
        for(Map.Entry<String, String> entry : clients_.entrySet()){
              Copy.put(entry.getKey(), entry.getValue());
        }
             return Copy;
    }
    */
    void populateJTable(JTable clientTable){                  // popluates the jTable with client information
        DefaultTableModel model = (DefaultTableModel)clientTable.getModel();
        model.getDataVector().removeAllElements();
        for(Map.Entry<String, String> entry : clients_.entrySet()){
            model.addRow(new Object[]{entry.getKey(),entry.getValue()});
        }
        
    }
    
    private String firstName_;
    private String lastName_;
    private String username_;
    private String password_;
    private String id_;
    private String role_;
    private Map<String, String>clients_ = new HashMap();
}
