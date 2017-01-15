package com.vadimrostov.domain.exeptions;

import com.vadimrostov.domain.User;

import javax.persistence.*;

/**
 * Created by Алиса on 13.01.2017.
 */

@Entity
@Table(name = "burgeruseradr")
public class UserAdress {


    private Long id;

    private User user;

    private String adress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adrid", nullable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
