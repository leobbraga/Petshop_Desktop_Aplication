/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.help;

import View.Login;
import model.User;

/**
 *
 * @author User
 */
public class loginHelper {
    
    private final Login view;

    public loginHelper(Login view) {
        this.view = view;
    }
    
    public User getModel() {
         String name = view.getTextUser().getText();
        String password = view.getTextPassword().getText();
    }
    
    public void setarModelo(Usuario modelo){
    String name = modelo.getName();
    String password = modelo.getPassword();
    view.getTextUser().setText(name);
    view.getTextPassword().setText(password);
    
    }
    public void cleanWindow(){
    view.getTextUser().setText("");
    view.getTextPassword().setText("");
    }
            
}
