package com.vadimrostov.domain;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Алиса on 08.01.2017.
 */

@Entity
@Table(name = "menuitems")
public class MenuItem implements Serializable{


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    public Long getId() {
        return id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
