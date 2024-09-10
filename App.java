// 9/10/24
//App.java
// String point to create objects from my classes

public class App {
    public static void main(String[] args) {

        System.out.println("\n\n welcome to my classes and object oriented program");

        Students myNewStudent = new Students();

        myNewStudent.age = 64;
        myNewStudent.gpa = 3.4;
        myNewStudent.major = "History";
        myNewStudent.firstname = "Jim";
        myNewStudent.lastname = "Harper";
        myNewStudent.onProbation = true;

        // Output some stuff about new student
        System.out.println("\nThe first name of our student is: " + myNewStudent.firstname + "\n\n");

        // Create more students
        Students anotherStudent = new Students();


        anotherStudent.major = "History";
        anotherStudent.age = 34;


        // How many students?
        System.out.println("\nThere were " + Students.numOfStudents + " Students objects created.");



        // create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "Pixel 8";
        myNewPhone.numOfCameras = 3;
        System.out.println("\nmyNewPhone has " + myNewPhone.numOfCameras + " cameras!\n");




    }
}