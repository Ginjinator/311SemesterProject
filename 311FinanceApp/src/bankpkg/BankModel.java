/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankpkg;

/**
 *
 * @author Erik
 */
public class BankModel {
    private String bankName;
    private String bankLocation;
    
    public BankModel(){
        bankName = "";
        bankLocation = "";
    }
    
    public BankModel(String bankName, String bankLocation){
        this.bankName = bankName;
        this.bankLocation = bankLocation;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }
    
    
}
