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
import java.util.ArrayList;
/**
 *
 * @author Erik
 */
public class GenerateDepositWindow extends JFrame implements ActionListener{
    
    ArrayList<accountpkg.CheckingAccountModel> tempCheckingList = new ArrayList();
    ArrayList<accountpkg.SavingsAccountModel> tempSavingsList = new ArrayList();
    accountpkg.CheckingAccountModel tempCheckAccount = new accountpkg.CheckingAccountModel();
    accountpkg.CheckingAccountController checkControl = new accountpkg.CheckingAccountController();
    accountpkg.SavingsAccountModel tempSaveAccount = new accountpkg.SavingsAccountModel();
    accountpkg.SavingsAccountController saveControl = new accountpkg.SavingsAccountController();
    
    JFrame newDepositWindow = new JFrame();
    
    //Remove hardcoded strings here
    JLabel accountInfo = new JLabel();
    JLabel bankName = new JLabel("Bank");
    JLabel userFullName = new JLabel("User full name");
    
    JLabel depositLabel = new JLabel("Deposit Amount:");
    JTextField depositAmount = new JTextField(10);
    
    JButton submit = new JButton("Submit");
    JButton changeAccount = new JButton("Change Account");
    JButton goBack = new JButton("Go back");
    JButton quit = new JButton("Quit");
    
    public void generateInfo(){
        tempCheckingList = adminpkg.MainAdmin.getCheckingList();
        tempSavingsList = adminpkg.MainAdmin.getSavingsList();
        
        tempCheckAccount = tempCheckingList.get(0);
        checkControl.getAccount(tempCheckAccount);
        tempSaveAccount = tempSavingsList.get(0);
        saveControl.getAccount(tempSaveAccount);
        
        accountInfo.setText(tempCheckAccount.getAccountNumber() + ": Checking");
    }
    
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
            double deposit = Double.parseDouble(depositAmount.getText());
            checkControl.deposit(deposit);
            tempCheckAccount.setAccountBalance(checkControl.checkBalance());
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
