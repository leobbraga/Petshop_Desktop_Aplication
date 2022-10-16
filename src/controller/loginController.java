/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import View.Login;
import controller.help.loginHelper;
import model.User;

/**
 *
 * @author User
 */
public class loginController {
    
    private final Login view;
    private loginHelper helper;
    
    public loginController(Login view) {
        this.view = view;
        this.helper = new loginHelper(view);
    }
    
    public void goInsideSystem(){
    
       User user = helper .getModel();
    }
    
    public void didWork(){
        System.out.printIn("Search in database");
        this.view.showMessage("Debbuged the goInsideSystem");
    }
}
