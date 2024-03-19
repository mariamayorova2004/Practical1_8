package com.mycompany.individual2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Мария
 */
public class Telephone {
    private String model;
    private String number;
    private String color;
    private boolean type;
    private String reNumber;


    public Telephone(String model, String number, String color, boolean type) {
        this.model = model;
        this.number = number;
        this.color = color;
        this.type = type;
        this.reNumber = reNumber;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public boolean isType() {
        return type;
    }

    public String getReNumber() {
        return reNumber;
    }
    
    
}
