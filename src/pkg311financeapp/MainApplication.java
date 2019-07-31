/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 *
 * @author Erik
 */
public class MainApplication extends Application{

    private static GenerateLoginWindow newLoginWindow = new GenerateLoginWindow();
    private static GenerateMainMenu newMainMenu = new GenerateMainMenu();
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        adminpkg.MainAdmin.createTestAccounts();
        
        newLoginWindow.createFrame();
        //Change after testing
        //newMainMenu.createFrame();
        
    }
    
}
