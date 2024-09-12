package myanimals;

public class Cat extends Animal{
    // The Cat class is a subclass of Animal.
    // so it should have all the methods from the Animal class
    // available to it.
    // This is polymorphise- this word means "many shapes"
    // when used here, by a cat object, this method that has the same name
    //as the method in the superclass, take another shape
    public static void  animalSound() {
        System.out.println("\nA sound from the Cat class used by a clas object - 'meow'.");
    }
}
