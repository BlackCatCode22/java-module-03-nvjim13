public class Dog {
    // Create two fields for our dog objects.


    private String name;
    private int age;

    // Create getters and setter for our fields

    //create getter and setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // create getter and setter for age
    public int getAge() {
        return this.age;
        // this would have worked as well because there is no ambiguity
        // return age;
    }

    public void setAge(int age) {
        this.age = age;
    }






    // Create a constructor for the dog objects that will be created with the "new" keyword
    // Constructor is a special method that is called or invoked when a dog object is used
    // to create an object.
    public Dog() {
        System.out.println("\nA dog object was created. This message is from the constructor");
    }

    // Create a constructor that accepts a String data type for a the dog's name
    public Dog(String myName) {
        this.name = myName;
    }

    //Create a constructor that accepts an argument when an object is created. This argument
    //will be an int
    public Dog(int theAge) {
        this.age = theAge;
    }

    // create a constructor that accepts two arguments - a string for the name, and an int for age.
    public Dog(String someName, int someAge) {
        //Assign name and age to our new object
        this.age = someAge;
        this.name = someName;
    }



}
