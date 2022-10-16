/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
abstract public class People {
    
    protected int id;
    protected String name;
    protected char gender;
    protected String birthdate;
    protected String phone;
    protected String email;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public People(int id, String name, char gender, String birthdate, String phone, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phone = phone;
        this.email = email;
    }
   
    
}
