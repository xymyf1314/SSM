package com.neuedu.ssm.entity;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author fan
 */
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String userPassword;
    private Integer userGrade;
    private String userPhone;
    private String userAddress;
    private Timestamp userRegisterDate;
    private Integer disable;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userGrade=" + userGrade +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userRegisterDate=" + userRegisterDate +
                ", disable=" + disable +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Timestamp getUserRegisterDate() {
        return userRegisterDate;
    }

    public void setUserRegisterDate(Timestamp userRegisterDate) {
        this.userRegisterDate = userRegisterDate;
    }

    public Integer getDisable() {
        return disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    public User(Integer id, String userName, String userPassword, Integer userGrade, String userPhone, String userAddress, Timestamp userRegisterDate, Integer disable) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGrade = userGrade;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userRegisterDate = userRegisterDate;
        this.disable = disable;
    }
}
