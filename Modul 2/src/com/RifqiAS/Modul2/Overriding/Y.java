package com.RifqiAS.Modul2.Overriding;

// Class Y yang mewarisi class X
public class Y extends X{
    // Method getValue
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value class Y\t: " + value);
    }
}

