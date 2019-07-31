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
public class SavingsAccountController implements AccountControllerInterface{
    
    private SavingsAccountModel temp = new SavingsAccountModel();
    
    public void getAccount(SavingsAccountModel savings){
        temp.setAccountNumber(savings.getAccountNumber());
        temp.setAccountBalance(savings.getAccountBalance());
    }
    public void updateAccount(SavingsAccountModel savings){
        //savings.setAccountNumber(temp.getAccountNumber()); Do not currently need to modify account number
        savings.setAccountBalance(temp.getAccountBalance());
    }

    public void createSavingsAccount(int accountNumber, double accountBalance, double rate){
        
    }
    
    @Override
    public void deposit(double deposit) {
        temp.setAccountBalance(temp.getAccountBalance() + deposit);
    }

    @Override
    public void withdrawal(double withdrawal) {
        temp.setAccountBalance(temp.getAccountBalance() - withdrawal);
    }

    @Override
    public double checkBalance() {
        return temp.getAccountBalance();
    }
    
    public double addInterest(double balance, double rate){
        return balance + (balance * rate);
    }
}
