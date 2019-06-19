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
public class MainAdmin {
    private static ArrayList<userpkg.UserModel> userList = new ArrayList<>();
    private static boolean correctUsername = false;
    private static boolean correctPassword = false;
    //A way to know which user is attempting to log in
    private static int userLoggingIn;
    
    public void createTestUsers(){
        userpkg.UserModel user1 = new userpkg.UserModel("user1", "I", "am", "User1", "Logmein");
        userpkg.UserModel user2 = new userpkg.UserModel("user2", "I", "am", "User2", "Logmein2");
        
        userList.add(user1);
        userList.add(user2);
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
 
}
