package com.bhuvesh;

public class Practice {
    int num ;
    String name;

    Practice(){
        System.out.println("No-Argument Constructor");
    }

    Practice(String name, int num){
        this.name = name;
        this.num = num;
        System.out.println("Parameterized Constructor");
    }


    //Constructor Overloading
    Practice(String names){
        System.out.println("Constructor with one Argument");
    }

    Practice(long id, int num){
        System.out.println("Constructor with two arguments");
    }
    
}
