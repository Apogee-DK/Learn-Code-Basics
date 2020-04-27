package functions;

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
