package ru.ncedu.purchasebot.model;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @Column( length = 15)
    private String login;
    @Column(nullable = false, length = 8)
    private String password;
    @Column(nullable = false, length = 40)
    private String email;
    private double account;


    public Customer() {}

    public Customer(String login, String password, String email, double account) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.account = account;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }
}
