/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class GenerateLoginWindow extends JFrame implements ActionListener{
    
    GenerateMainMenu mainMenu = new GenerateMainMenu();
    
    JTextField usernameField = new JTextField(30);
    JLabel usernameLabel = new JLabel("Enter Username: ");
    static JLabel usernameSuggest = new JLabel("");
    JTextField passwordField = new JTextField(30);
    JLabel passwordLabel = new JLabel("Enter password: ");
    static JLabel passwordSuggest = new JLabel("");
    JButton loginButton = new JButton("Log-in");
    JButton forgotPassword = new JButton("Forgot Password");
    
    // Change when name for app is picked
    JFrame mainWindow = new JFrame("Finance App Log-in");

    //Invoked to create gui for login
    public void createFrame(){
        
        mainWindow.setLayout(new GridLayout(0,2));
        GenerateLoginWindow gw = new GenerateLoginWindow();
        loginButton.addActionListener(gw);
        JPanel usernamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JPanel suggestionPanel = new JPanel();
        
        
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);
        suggestionPanel.add(usernameSuggest);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        suggestionPanel.add(passwordSuggest);
        buttonPanel.add(forgotPassword);
        buttonPanel.add(loginButton);
        
        mainWindow.add(usernamePanel);
        mainWindow.add(suggestionPanel);
        mainWindow.add(passwordPanel);
        mainWindow.add(buttonPanel);
        
        //Essentials
        mainWindow.setSize(700, 200);
        mainWindow.show();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    //Done when login pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Log-in")){
            System.out.println("Login");
            String usernameToTest = usernameField.getText();
            String passwordToTest = passwordField.getText();
            if (adminpkg.MainAdmin.testLogin(usernameToTest, passwordToTest)){
                usernameSuggest.setText("Correct login");
            } else {
                usernameSuggest.setText("Incorrect Username or Password");
            }
            mainMenu.generateInfo();
            mainMenu.createFrame();
            /*if (adminpkg.MainAdmin.testUsername(usernameToTest)){
                usernameSuggest.setText("That is a user");
            } else {
                usernameSuggest.setText("That is not a user");
            }
            if (adminpkg.MainAdmin.testPassword(passwordToTest)){
                passwordSuggest.setText("That is the right password");
            } else {
                passwordSuggest.setText("That is not the password");
            }
            */
        }
    }
    
}