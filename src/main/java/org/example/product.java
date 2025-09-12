package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class product {

    @Id  //das ist der Primärschlüssel.
    @GeneratedValue(strategy = GenerationType.AUTO) //der Wert wird automatisch von der DB erzeugt (z.B. 1, 2, 3 …).
    private Long id;
    private String name;
    private String description;
    private double price;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;


    }
    public String getName() {
        return name;

    }
    public void setDescription(String description) {
        this.description = description;

    }
    public String getDescription() {
        return description;

    }
    public void setPrice(double price) {
        this.price = price;

    }
    public double getPrice() {
        return price;

    }

}
