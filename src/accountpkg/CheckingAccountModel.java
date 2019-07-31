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
public class CheckingAccountModel {
    
    private int accountNumber;
    private double accountBalance;
    
    public CheckingAccountModel(){
        this.accountNumber = 0;
        this.accountNumber = 0;
    }
    
    public CheckingAccountModel(int accountNumber, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
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
    
}
