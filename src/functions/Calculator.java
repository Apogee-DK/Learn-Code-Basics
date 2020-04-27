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

    public int getVersion() {
        return version;
    }

    // public, private, protected
    // static: You don't have to create the object to use it.
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }
}
