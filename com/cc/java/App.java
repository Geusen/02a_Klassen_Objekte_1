package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt 1 erzeugen + Wertezuweisung
        Cat cat = new Cat("Alonzo", "grey", 35);    // Instanziierung
        output("Adresse des Objekts: " + cat);

        // Wertzuweisung Objekt 1
        // cat.name = "Alonzo";
        // cat.furColor = "grey";
        // cat.age = 35;
      
    

       // Ausgabe Objekt 1
        // System.out.println(cat.tellYourName());
        // System.out.println(cat.tellYourFurColor());
        // System.out.println(cat.tellYourAge());
        

        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge())); // int ---> String

        // output(cat.name);

        output("-------");

        // Objekt 2 erzeugen + Wertzuweisung
        Cat cat2 = new Cat("Grizabella", "white", 29);
        
        // cat2.furColor = "grey";


        // Wertzuweisung Objekt 2
        //  cat2.name = "Grizabella";
        //  cat2.furColor = "white";
        //  cat2.age = 29;
 
     
 
        // Ausgabe Objekt 2
         output(cat2.getName());
         output(cat2.getFurColor());
         output(String.valueOf(cat2.getAge()));

    }

    // Statische Methode ---- in Klasse
  public static void output(String outputStr) {
    System.out.println(outputStr);
  }


}

