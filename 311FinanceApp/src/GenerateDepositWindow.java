/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Erik
 */
public class GenerateDepositWindow extends JFrame implements ActionListener{
    
    JFrame newDepositWindow = new JFrame();
    
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
        
        newDepositWindow.setLayout(new BorderLayout());
        GenerateDepositWindow dw = new GenerateDepositWindow();
        submit.addActionListener(dw);
        changeAccount.addActionListener(dw);
        goBack.addActionListener(dw);
        quit.addActionListener(dw);
        
        //Panels
        JPanel accountInfoPanel = new JPanel(new GridLayout(0, 3));
        JPanel depositPanel = new JPanel(new GridLayout(3, 0));
        JPanel buttonPanel = new JPanel(new GridLayout(0, 3));
        
        accountInfoPanel.add(accountInfo);
        accountInfoPanel.add(bankName);
        accountInfoPanel.add(userFullName);
        
        depositPanel.add(depositLabel);
        depositPanel.add(depositAmount);
        depositPanel.add(submit);
        
        buttonPanel.add(changeAccount);
        buttonPanel.add(goBack);
        buttonPanel.add(quit);
        
        //Add panels to window
        newDepositWindow.add(accountInfoPanel, BorderLayout.NORTH);
        newDepositWindow.add(depositPanel, BorderLayout.CENTER);
        newDepositWindow.add(buttonPanel, BorderLayout.SOUTH);
        
        //Essentials
        newDepositWindow.setSize(550, 200);
        newDepositWindow.show();
        newDepositWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String s = arg0.getActionCommand();
        if(s.equals("Submit")){
            System.out.print("Submit");
        }
        if(s.equals("Change Account")){
            
        }
        if(s.equals("Go back")){
            newDepositWindow.setVisible(false);
            newDepositWindow.dispose();
        }
        if(s.equals("Quit")){
            newDepositWindow.dispose();
        }
    }
}
