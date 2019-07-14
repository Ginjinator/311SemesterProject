/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminpkg;

import java.util.ArrayList;
/**
 * Class used for storing lists of users
 * 
 * @author Erik
 */
public class MainAdmin{
    private static ArrayList<userpkg.UserModel> userList = new ArrayList<>();
    private static ArrayList<accountpkg.CheckingAccountModel> checkingAccountList = new ArrayList<>();
    private static ArrayList<accountpkg.SavingsAccountModel> savingsAccountList = new ArrayList<>();
    private static boolean correctUsername = false;
    private static boolean correctPassword = false;
    private static boolean correctLogin = false;
    //A way to know which user is attempting to log in
    private static int userLoggingIn;
    
    static String[] arrayUsername = {"Rami", "Erik", "Akshaj", "Rachele", "Ester", "Stella", "John", "Matthew", "Renuka", "Megan"};
    static String[] arrayPassword = {"123", "456", "789", "101112", "131415", "161718", "192021", "222324", "252627", "282930"};
    
    public void createTestUsers(){
        userpkg.UserModel user1 = new userpkg.UserModel("user1", "I", "am", "User1", "Logmein");
        userpkg.UserModel user2 = new userpkg.UserModel("user2", "I", "am", "User2", "Logmein2");
        
        userList.add(user1);
        userList.add(user2);
        
    }
    
    public void createTestAccounts(){
        accountpkg.CheckingAccountModel checking1 = new accountpkg.CheckingAccountModel(1234, 10.0);
        accountpkg.CheckingAccountModel checking2 = new accountpkg.CheckingAccountModel(5678, 15.0);
        accountpkg.SavingsAccountModel savings1 = new accountpkg.SavingsAccountModel(1234, 10.0, 0.04);
        accountpkg.SavingsAccountModel savings2 = new accountpkg.SavingsAccountModel(5678, 15.0, 0.05);
        
        checkingAccountList.add(checking1);
        checkingAccountList.add(checking2);
        savingsAccountList.add(savings1);
        savingsAccountList.add(savings2);
    }
    
    //Used to test the input username to see if it exists in the list of users
    public static boolean testUsername(String enteredUsername){
        for(int i = 0; i >= userList.size(); i ++){
            //                                 user#.getUsername()
            String usernameChecking = userList.get(i).getUsername();
            if(enteredUsername.equalsIgnoreCase(usernameChecking)){
                correctUsername = true;
                userLoggingIn = i;
            }
        }
        return correctUsername;
    }
    
    public static boolean testPassword(String enteredPassword){
        return correctPassword;
    }
    
    //Used to test the input username to see if it exists in the list of users
    public static boolean testLogin(String username, String password){
        for(int i = 0; i >= arrayPassword.length; i++){ 
            if((username.equals(arrayUsername[i])&& password.equals(arrayPassword[i]))||
                (username.equals(arrayUsername[++i])&& password.equals(arrayPassword[i]))){
                    correctLogin = true;
            } else {
                System.out.print("Incorrect Username or Password");
            }
        }
        return correctLogin;
    }
 
}
