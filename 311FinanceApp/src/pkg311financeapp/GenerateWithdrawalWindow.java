/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Erik
 */
public class GenerateWithdrawalWindow extends JFrame implements ActionListener{
    
    JFrame newWithdrawalWindow = new JFrame();
    
    //Remove hardcoded strings here
    JLabel accountInfo = new JLabel("Account#: Type");
    JLabel bankName = new JLabel("Bank");
    JLabel userFullName = new JLabel("User full name");
    
    JLabel depositLabel = new JLabel("Deposit Amount:");
    JTextField depositAmount = new JTextField(10);
    
    JButton submit = new JButton("Submit");
    JButton changeAccount = new JButton("Change Account");
    JButton goBack = new JButton("Go back");
    JButton quit = new JButton("Quit");
    
    public void createFrame(){
        
        newWithdrawalWindow.setLayout(new BorderLayout());
        GenerateWithdrawalWindow wW = new GenerateWithdrawalWindow();
        submit.addActionListener(wW);
        changeAccount.addActionListener(wW);
        goBack.addActionListener(wW);
        quit.addActionListener(wW);
        
        //Essentials
        newWithdrawalWindow.setSize(500, 200);
        newWithdrawalWindow.show();
        newWithdrawalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
