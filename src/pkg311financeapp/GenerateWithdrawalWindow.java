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
public class GenerateWithdrawalWindow extends JFrame implements ActionListener{
    
    ArrayList<accountpkg.CheckingAccountModel> tempCheckingList = new ArrayList();
    ArrayList<accountpkg.SavingsAccountModel> tempSavingsList = new ArrayList();
    accountpkg.CheckingAccountModel tempCheckAccount = new accountpkg.CheckingAccountModel();
    accountpkg.CheckingAccountController checkControl = new accountpkg.CheckingAccountController();
    accountpkg.SavingsAccountModel tempSaveAccount = new accountpkg.SavingsAccountModel();
    accountpkg.SavingsAccountController saveControl = new accountpkg.SavingsAccountController();
    
    JFrame newWithdrawalWindow = new JFrame();
    
    //Remove hardcoded strings here
    JLabel accountInfo = new JLabel("Account#: Type");
    JLabel bankName = new JLabel("Bank");
    JLabel userFullName = new JLabel("User full name");
    
    JLabel withdrawalLabel = new JLabel("Withdrawal Amount:");
    JTextField withdrawalAmount = new JTextField(10);
    
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
        
        newWithdrawalWindow.setLayout(new BorderLayout());
        GenerateWithdrawalWindow wW = new GenerateWithdrawalWindow();
        submit.addActionListener(wW);
        changeAccount.addActionListener(wW);
        goBack.addActionListener(wW);
        quit.addActionListener(wW);
        
        //Panels
        JPanel accountInfoPanel = new JPanel(new GridLayout(0, 3));
        JPanel depositPanel = new JPanel(new GridLayout(3, 0));
        JPanel buttonPanel = new JPanel(new GridLayout(0, 3));
        
        accountInfoPanel.add(accountInfo);
        accountInfoPanel.add(bankName);
        accountInfoPanel.add(userFullName);
        
        depositPanel.add(withdrawalLabel);
        depositPanel.add(withdrawalAmount);
        depositPanel.add(submit);
        
        buttonPanel.add(changeAccount);
        buttonPanel.add(goBack);
        buttonPanel.add(quit);
        
        //Essentials
        newWithdrawalWindow.setSize(500, 200);
        newWithdrawalWindow.show();
        newWithdrawalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newWithdrawalWindow.add(accountInfoPanel, BorderLayout.NORTH);
        newWithdrawalWindow.add(depositPanel, BorderLayout.CENTER);
        newWithdrawalWindow.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String s = arg0.getActionCommand();
        if(s.equals("Submit")){
            System.out.print("Submit");
            double withdrawal = Double.parseDouble(withdrawalAmount.getText());
            checkControl.withdrawal(withdrawal);
            tempCheckAccount.setAccountBalance(checkControl.checkBalance());
        }
        if(s.equals("Change Account")){
            
        }
        if(s.equals("Go back")){
            newWithdrawalWindow.setVisible(false);
            newWithdrawalWindow.dispose();
        }
        if(s.equals("Quit")){
            newWithdrawalWindow.dispose();
        }
    }
    
}
