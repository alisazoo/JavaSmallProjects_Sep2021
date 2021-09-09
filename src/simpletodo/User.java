package simpletodo;

import java.io.Serializable;

/**
 *
 * JavaBean class used in jsp action tags.
 * Created 9/9/2021 by Arisa
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String givenName;
    private String surName;
    private String userName;
    private String password;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



