package pers.hanchao.myssm.test.mvc;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * <p>用户名密码，用于验证validation</p>
 * @author hanchao 2018/2/6 22:00
 **/
public class User {
    /** 用户名 */
    @NotNull
    @Length(min = 4,max = 20,message = "{Length.User.username}")
    private String username;

    /** 密码 */
    @NotNull
    @Length(min = 6,max = 20,message = "{Length.User.password}")
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
