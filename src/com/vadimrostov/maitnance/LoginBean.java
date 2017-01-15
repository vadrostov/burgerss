package com.vadimrostov.maitnance;

import org.springframework.stereotype.Component;

/**
 * Created by Алиса on 10.01.2017.
 */

@Component
public class LoginBean {

    public String login;
    public String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
