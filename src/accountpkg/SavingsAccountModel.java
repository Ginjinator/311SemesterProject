/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountpkg;

/**
 *
 * @author Erik
 */
public class SavingsAccountModel {
    private int accountNumber;
    private double accountBalance;
    private double accountInterestRate;
    
    public SavingsAccountModel(){
        this.accountNumber = 0;
        this.accountBalance = 0.0;
        this.accountInterestRate = 0.0;
    }
    
    public SavingsAccountModel(int accountNumber, double accountBalance, double accountInterestRate){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountInterestRate = accountInterestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountInterestRate() {
        return accountInterestRate;
    }

    public void setAccountInterestRate(double accountInterestRate) {
        this.accountInterestRate = accountInterestRate;
    }
    
    
}
