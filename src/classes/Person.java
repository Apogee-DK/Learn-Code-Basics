package classes;

// Define the name of the class
// In this case, Person is the name of the class
public class Person {
    // Specify the properties you wish to add to the class
    public int age;
    public String name;
    public Gender gender;

    // Each class has a constructor. A constructor defines the way the Person object will be created.
    // The constructor can accept arguments as well in order to personalize the creation of the Person object.
    public Person() {
    }

    public Person(int age, String name, Gender gender) {
        // For readability, the parameters have the same name as the properties defined in the class Person.
        // The use of `this` is needed in order to access the correct properties of object.
        // In this case, `this` refers to the Person object being created.
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    // Functions can also be defined in a class
    // In this case, the getAge function is a property of the class person
    // This function can only be used when you create the Person object
    public int getAge() {
        return age;
    }

    // To define a function which you want to use from class Person without requiring the object,
    // you can apply `static` to the function.
    public static String printInformation() {
        return "They are mammals";
    }
}
