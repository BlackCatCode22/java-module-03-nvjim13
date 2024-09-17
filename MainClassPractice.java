// NVJ 9/17/24
//MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my OOP Class Practice Program!");

        // Create a couple dog objects
        // with an empty arguments (no args)
        Dog mydog = new Dog();
        Dog anotherdog = new Dog();


        // create a dog with a string name
        Dog aDog =  new Dog("Spot");


        // lets output the new dog objects name
        System.out.println("\nThe new dog's name is: " + aDog.getName());


        // create a fourth dog with an int age.
        Dog fourthDog = new Dog(33);

        //output the dog's age
        System.out.println("\nMy new dog's age is: " + fourthDog.getAge());

        // And... finally create a fifth and last dog
        Dog fifthDog = new Dog("my new dog's name ", 7);

        // Validate it.
        System.out.println("My dog, who is named: " + fifthDog.getName() + ", had a birthday and age is now: " + fifthDog.getAge());

        // give our dog a birthday (add a year to its age)
        fifthDog.setAge(fifthDog.getAge()+1);






    }
}