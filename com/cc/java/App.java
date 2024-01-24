package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt 1 erzeugen
        Cat cat = new Cat();    // Instanziierung
        output("Adresse des Objekts: " + cat);

        // Wertzuweisung Objekt 1
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;

    

       // Ausgabe Objekt 1
        // System.out.println(cat.tellYourName());
        // System.out.println(cat.tellYourFurColor());
        // System.out.println(cat.tellYourAge());
        

        output("hi");
        output(cat.tellYourName());
        output(cat.tellYourFurColor());
        output(String.valueOf(cat.tellYourAge())); // int ---> String

        

        output("-------");

        // Objekt 2 erzeugen
        Cat cat2 = new Cat();
        output("Adresse des Objekts: " + cat2);


         /// Wertzuweisung Objekt 2
         cat2.name = "Grizabella";
         cat2.furColor = "white";
         cat2.age = 29;
 
     
 
        // Ausgabe Objekt 2
         output(cat2.tellYourName());
         output(cat2.tellYourFurColor());
         output(String.valueOf(cat2.tellYourAge()));

    }

    // Statische Methode ---- in Klasse
  public static void output(String outputStr) {
    System.out.println(outputStr);
  }


}

