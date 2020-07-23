/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Car {
    private String plateNo;
    private String color;
    private int year;
    CarType type;

    public Car(String plateNo, String color, int year, CarType type) {
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.type = type;
    }
    
    @Override
    public String toString(){
     return String.format("%-10s %-10s %-8d %s",plateNo,color,year,type.toString()); 
    }
}