/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

/**
 *
 * @author Erik
 */
public class MainApplication{

    private static GenerateLoginWindow newWindow = new GenerateLoginWindow();
    private static adminpkg.MainAdmin admin = new adminpkg.MainAdmin();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        newWindow.createFrame();
        admin.createTestUsers();
        
    }
    
}
