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
public class Client {
    
    private int id;
    private String name;
    private char gender;
    private String birthdate;
    private String phone;
    private String email;
    private String address;
    private String zipcode;

    public Client(int id, String name, char gender, String birthdate, String phone, String email, String address, String zipcode) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.zipcode = zipcode;
    }

    public Client(int id, String name, char gender, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

   
}
