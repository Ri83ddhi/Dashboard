/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class UserModel {
    public int id;
    public String name;
    public String type;
    public String email;
    
    public UserModel(int id, String name,String type,String email){
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
    }
    
}
