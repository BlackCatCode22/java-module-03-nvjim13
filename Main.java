//NVJ 919/24
// Main.java
// Driver file for Animal and Hyena class usage

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo Program!");


        // Open the arriving animals file.
        try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/noemivergara/Desktop/Java Projects/JavaStuff/arrivingAnimals.txt"));
        String myLine;

        // Read the file one line at a time
            while ((myLine = bufferedReader.readLine())!=null){
            System.out.println(myLine);
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }



        // Create an Animal object
        Animal myAnimalObject = new Animal();

        myAnimalObject.setAge(4);

        // now lets use our new Animal object
        System.out.println("\nMy animal's age is: " + myAnimalObject.getAge() + " years old.");


        // Create a Hyena object
        Hyena myNewHyena = new Hyena();

        myNewHyena.setAge(7);

        // output the age of the Hyena
        System.out.println("\nThe age of our Hyena is: " + myNewHyena.getAge() + " years old.");


        // Create a lion object
        Lion myLion = new Lion();

        // Make the lions age 12 years old
        myLion.setAge(12);

        // output our lions age
        System.out.println("\nMy lion's age is: " + myLion.getAge() + " years old.");


        // output the number of animals
        System.out.println("\nThe number of animals created is: " + Animal.numOfAnimals);






    }
}