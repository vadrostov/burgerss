package com.vadimrostov.domain;

import com.vadimrostov.domain.exeptions.UserAdress;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Алиса on 09.01.2017.
 */

@Entity
@Table(name = "burgerusers")
public class User implements Serializable{

    private Long id;

    private String login;

    private String password;

    private String phonenumber;

    private String role;

    private String email;

    private Double moneysgoes;

    private Set<UserAdress> userAdresses=new HashSet<>(0);

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="moneysgoes")
    public Double getMoneysgoes() {
        return moneysgoes;
    }

    public void setMoneysgoes(Double moneysgoes) {
        this.moneysgoes = moneysgoes;
    }

   /* @OneToMany(fetch = FetchType.LAZY, mappedBy = "burgerusers")
    public Set<UserAdress> getUserAdresses() {
        return this.userAdresses;
    }

    public void setUserAdresses(Set<UserAdress> userAdresses) {
        this.userAdresses = userAdresses;
    }*/
}
