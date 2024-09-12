// 9-12-24
// Mqin.jqvq
import myanimals.Animal;
import myanimals.Cat;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;


public class Main {
    public static void main(String[] args) {

        System.out.println("\nHello and welcome from the Main!\n");


        // Create an student object.
        Student student = new Student();


        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the student class.
        // I know that I have a static method in the student class
        // and I know how to call a static class method.
        Student.sayHello();


        // Call a method that belongs to the student object.
        student.sayHi();

        // Output the number of animals
        System.out.println("\nThe number of animals is: " + Animal.numOfAnimals);



        // Create a cat object.
        Cat cat = new Cat();
        // Use a method that is available to the Cat object named cat.
        System.out.println("\nThis sound is coming from the Cat object named cat...");
        cat.animalSound();


        //Create a dog object
        Dog dog = new Dog();
        // Use a method that is available to the Cat object named dog.
        System.out.println("\nThis sound is coming from the Dog object named dog...");
        dog.animalSound();


        // Output the number of animals
        System.out.println("\nThe number of animals is: " + Animal.numOfAnimals);








    }
}