/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp.OldFXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author Erik
 */
public class LoginFXMLController implements Initializable {
    
    @FXML
    private Label usernameSuggest;
    private TextField usernameField;
    private PasswordField passwordField;
    
    @FXML
    public void handleLoginAction(ActionEvent e){
      
        String s = e.toString();
        if (s.equals("Login")){
            String usernameToTest = usernameField.getText();
            String passwordToTest = passwordField.getText();
            if (adminpkg.MainAdmin.testLogin(usernameToTest, passwordToTest)){
                usernameSuggest.setText("Correct Username and password");
                System.out.print("Correct Username and Password");
            } else {
                usernameSuggest.setText("Incorrect Username and Password");
                System.out.print("Incorrect Username and Password");
            }
            /*if (adminpkg.MainAdmin.testUsername(usernameToTest)){
                usernameSuggest.setText("That is a user");
            } else {
                usernameSuggest.setText("That is not a user");
            }
            if (adminpkg.MainAdmin.testPassword(passwordToTest)){
                passwordSuggest.setText("That is the right password");
            } else {
                passwordSuggest.setText("That is not the password");
            }*/
                
        }
    }
  

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //TODO
    }    
    
}
