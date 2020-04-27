package functions;


/*
    Your task:
    1 - Create a new Calculator<Name> in the package functions
    2 - Create two functions, a static divide (/) and a non-static multiply (*), and returns the value
    3 - Create a class called Driver<Name> with a main function in the functions package
    4 - In the Driver, create your calculator and use the functions which you have created (Use numbers between 1 and 100)
    6a - If number is greater than 50, print in console -> "Number is greater than 50: <your number>
    6b - If number is less than 50, print in console -> "Number is less than 50: <your number>"
 */
public class Calculator {

    public String name;
    public int version;

    public Calculator() {
        this.version = 0;
    }

    public Calculator(int version) {
        this.version = version;
    }

    // Functions can be created by defining the following values
    // Accessibility:
    // - public (function can be accessed anywhere)
    // - private (function can only be accessed within the object)
    // - protected (function can only be accessed within the same package)
    // Static (optional)
    // Data type: Specify the type of value to return (can be void)
    // - void means that the function will not return anything
    // Method name
    // Parameters (type and name) - Unlimited number of arguments separated by commas. It can be empty as well.

    // Function format
    // <accessibility> <static [optional]> <data type> <method name>(<type> <name>, <type> <name>, ...)
    public int getVersion() {
        // You will always need to write your logic within the scope of a function
        // The scope is defined by the curly braces `{ }`
        return version;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }
}
