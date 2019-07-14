/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Erik
 */
public class GenerateCheckBalance extends JFrame implements ActionListener{
    
    JFrame checkBalanceWindow = new JFrame();
    
    JLabel accountInfo = new JLabel("Account#: Type");
    JLabel balance = new JLabel("$$$$$");
    
    JButton close = new JButton("Close");
    
    public void createFrame(){
        
        checkBalanceWindow.setLayout(new BorderLayout());
        GenerateCheckBalance balanceWindow = new GenerateCheckBalance();
        close.addActionListener(balanceWindow);
        
        checkBalanceWindow.add(accountInfo, BorderLayout.NORTH);
        checkBalanceWindow.add(balance, BorderLayout.CENTER);
        checkBalanceWindow.add(close, BorderLayout.SOUTH);
        
        //Essentials
        checkBalanceWindow.setSize(400, 300);
        checkBalanceWindow.show();
        checkBalanceWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        dispose();
    }
}
