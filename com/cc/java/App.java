package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt 1 erzeugen
        Cat cat = new Cat();    // Instanziierung
        System.out.println(cat);

        // Wertzuweisung Objekt 1
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;

    

       // Ausgabe Objekt 1
        System.out.println(cat.name);
        System.out.println(cat.furColor);
        System.out.println(cat.age);
        

        System.out.println("-------");

        // Objekt 2 erzeugen
        Cat cat2 = new Cat();
        System.out.println(cat2);


         /// Wertzuweisung Objekt 2
         cat2.name = "Grizabella";
         cat2.furColor = "white";
         cat2.age = 29;
 
     
 
        // Ausgabe Objekt 2
         System.out.println(cat2.name);
         System.out.println(cat2.furColor);
         System.out.println(cat2.age);

    }

   

}

