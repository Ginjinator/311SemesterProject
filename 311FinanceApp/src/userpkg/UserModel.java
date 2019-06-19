/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpkg;

/**
 *
 * @author Erik
 */
public class UserModel {
    private String username;
    private String password;
    private String userFirstName;
    private String userMiddle;
    private String userLastName;

    public UserModel(String username, String password, String userFirstName, String userMiddle, String userLastName) {
        this.username = username;
        this.password = password;
        this.userFirstName = userFirstName;
        this.userMiddle = userMiddle;
        this.userLastName = userLastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserMiddle() {
        return userMiddle;
    }

    public void setUserMiddle(String userMiddle) {
        this.userMiddle = userMiddle;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    
    
}
