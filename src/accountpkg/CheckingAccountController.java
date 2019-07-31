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
public class CheckingAccountController implements AccountControllerInterface {

    CheckingAccountModel temp = new CheckingAccountModel();
    
    public void getAccount(CheckingAccountModel checking){
        temp.setAccountNumber(checking.getAccountNumber());
        temp.setAccountBalance(checking.getAccountBalance());
    }
    public void updateAccount(CheckingAccountModel checking){
        //checking.setAccountNumber(temp.getAccountNumber()); Do not currently need to modify account number
        checking.setAccountBalance(temp.getAccountBalance());
    }
    
    public void createCheckingAccount(int accountNumber, double accountBalance){
        
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
    
}
