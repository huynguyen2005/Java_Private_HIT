package org.example;

import jakarta.persistence.*;

@Entity
public class Category { //ten lop = tenbang
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //ten thuoc tinh  = ten cot
    @Column(columnDefinition = "varchar(100)", nullable = false)
    private String name;
    public Category(){
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
