package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt erzeugen
        Cat cat = new Cat();    // Instanziierung
        System.out.println(cat);

        // Wertzuweisung
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;

    

       // Ausgabe 
        System.out.println(cat.name);
        System.out.println(cat.furColor);
        System.out.println(cat.age);
        

        System.out.println("-------");

        Cat cat2 = new Cat();
        System.out.println(cat2);
        

         // Wertzuweisung
         cat2.name = "Grizabella";
         cat2.furColor = "white";
         cat2.age = 29;
 
     
 
        // Ausgabe 
         System.out.println(cat2.name);
         System.out.println(cat2.furColor);
         System.out.println(cat2.age);

    }

   

}

