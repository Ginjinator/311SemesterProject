/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311financeapp;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Erik
 */
public class GenerateMainMenu extends JFrame implements ActionListener{

    GenerateCheckBalance checkBalanceWindow = new GenerateCheckBalance();
    GenerateDepositWindow depositWindow = new GenerateDepositWindow();
    GenerateWithdrawalWindow withdrawalWindow = new GenerateWithdrawalWindow();
    
    JLabel blank = new JLabel("");
    JLabel username = new JLabel("Username");
    JLabel name = new JLabel("User full name");
    
    //Account Numbers (current max of 5)
    //Remove hardcoded text in labels after testing
    JLabel accountNumber1 = new JLabel("1231");
    JLabel accountNumber2 = new JLabel("1232");
    JLabel accountNumber3 = new JLabel("1233");
    JLabel accountNumber4 = new JLabel("1234");
    JLabel accountNumber5 = new JLabel("1235");
    
    //Account Type label (max of same as account)
    //Remove hardcoded text in labels after testing
    JLabel account1Type = new JLabel("Checking");
    JLabel account2Type = new JLabel("Checking");
    JLabel account3Type = new JLabel("Savings");
    JLabel account4Type = new JLabel("Savings");
    JLabel account5Type = new JLabel("Checking");
    
    JButton selectAccount1 = new JButton("Select 1");
    JButton selectAccount2 = new JButton("Select 2");
    JButton selectAccount3 = new JButton("Select 3");
    JButton selectAccount4 = new JButton("Select 4");
    JButton selectAccount5 = new JButton("Select 5");
    
    //Buttons for selected account
    JButton checkBalance = new JButton("Check Balance");
    JButton deposit = new JButton("Deposit");
    JButton withdrawal = new JButton("Withdrawal");
    JButton transfer = new JButton("Transfer");
    
    JFrame mainMenu = new JFrame("Main Menu");
    
    public void createFrame(){
        //Change to layout that allows buttons and info to stay aligned
        mainMenu.setLayout(new BorderLayout());
        GenerateMainMenu mM = new GenerateMainMenu();
        checkBalance.addActionListener(mM);
        deposit.addActionListener(mM);
        withdrawal.addActionListener(mM);
        transfer.addActionListener(mM);
        JPanel topInfoPanel = new JPanel(new GridLayout(0, 3));
        JPanel accountInfoPanel = new JPanel(new GridLayout(0, 3));
        JPanel buttonPanel = new JPanel();
        
        
        
        topInfoPanel.add(username);
        topInfoPanel.add(blank);
        topInfoPanel.add(name);
        
        // Add account numbers and account type
        accountInfoPanel.add(accountNumber1);
        accountInfoPanel.add(account1Type);
        accountInfoPanel.add(selectAccount1);
        accountInfoPanel.add(accountNumber2);
        accountInfoPanel.add(account2Type);
        accountInfoPanel.add(selectAccount2);
        accountInfoPanel.add(accountNumber3);
        accountInfoPanel.add(account3Type);
        accountInfoPanel.add(selectAccount3);
        accountInfoPanel.add(accountNumber4);
        accountInfoPanel.add(account4Type);
        accountInfoPanel.add(selectAccount4);
        accountInfoPanel.add(accountNumber5); 
        accountInfoPanel.add(account5Type);
        accountInfoPanel.add(selectAccount5);
        
        //Add buttons
        buttonPanel.add(checkBalance);
        buttonPanel.add(deposit);
        buttonPanel.add(withdrawal);
        buttonPanel.add(transfer);
        
        mainMenu.add(topInfoPanel, BorderLayout.NORTH);
        mainMenu.add(accountInfoPanel);//, BorderLayout.WEST);
        mainMenu.add(buttonPanel, BorderLayout.SOUTH);
        
        //Essentials
        mainMenu.setSize(700, 200);
        mainMenu.show();
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        String s = arg0.getActionCommand();
        if(s.equals("Check Balance")){
            System.out.print("Check");
            checkBalanceWindow.createFrame();
        }
        if(s.equals("Deposit")){
            depositWindow.createFrame();
        }
        if(s.equals("Withdrawal")){
            withdrawalWindow.createFrame();
        }
    }
    
}
