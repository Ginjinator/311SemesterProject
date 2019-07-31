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
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Erik
 */
public class GenerateCheckBalance extends JFrame implements ActionListener{
    
    ArrayList<accountpkg.CheckingAccountModel> tempCheckingList = new ArrayList();
    ArrayList<accountpkg.SavingsAccountModel> tempSavingsList = new ArrayList();
    accountpkg.CheckingAccountModel tempCheckAccount = new accountpkg.CheckingAccountModel();
    accountpkg.CheckingAccountController checkControl = new accountpkg.CheckingAccountController();
    accountpkg.SavingsAccountModel tempSaveAccount = new accountpkg.SavingsAccountModel();
    accountpkg.SavingsAccountController saveControl = new accountpkg.SavingsAccountController();
    
    
    JFrame checkBalanceWindow = new JFrame();
    
    JLabel accountInfo = new JLabel();
    JLabel balance = new JLabel();
    
    JButton close = new JButton("Close");
    
    public void generateInfo(){
        tempCheckingList = adminpkg.MainAdmin.getCheckingList();
        tempSavingsList = adminpkg.MainAdmin.getSavingsList();
        tempCheckAccount =  tempCheckingList.get(0);
        tempSaveAccount = tempSavingsList.get(0);
        
        int accountNum = tempCheckAccount.getAccountNumber();
        double accountBalance = tempCheckAccount.getAccountBalance();
        
        accountInfo.setText(Integer.toString(accountNum) + ": Checking");
        balance.setText("$" + accountBalance);
        
    }
    
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
