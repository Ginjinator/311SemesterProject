/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class GenerateLoginWindow extends JFrame implements ActionListener{
    
    JTextField usernameField = new JTextField(30);
    JLabel usernameLabel = new JLabel("Enter Username: ");
    static JLabel usernameSuggest = new JLabel();
    JTextField passwordField = new JTextField(30);
    JLabel passwordLabel = new JLabel("Enter password: ");
    static JLabel passwordSuggest = new JLabel();
    
    // Change when name for app is picked
    JFrame mainWindow = new JFrame("Finance App Log-in");
    JButton loginButton = new JButton("Log-in");
    
    public void createFrame(){
        GenerateLoginWindow gw = new GenerateLoginWindow();
        loginButton.addActionListener(gw);
        JPanel newPanel = new JPanel();
        
        newPanel.add(usernameLabel);
        newPanel.add(usernameField);
        newPanel.add(usernameSuggest);
        newPanel.add(passwordLabel);
        newPanel.add(passwordField);
        newPanel.add(passwordSuggest);
        newPanel.add(loginButton);
        
        mainWindow.add(newPanel);
        mainWindow.setSize(550, 160);
        mainWindow.show();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Login")){
            String usernameToTest = usernameField.getText();
            String passwordToTest = passwordField.getText();
            if (adminpkg.MainAdmin.testUsername(usernameToTest)){
                usernameSuggest.setText("That is a user");
            } else {
                usernameSuggest.setText("That is not a user");
            }
            if (adminpkg.MainAdmin.testPassword(passwordToTest)){
                passwordSuggest.setText("That is the right password");
            } else {
                passwordSuggest.setText("That is not the password");
            }
                
        }
    }
    
}
