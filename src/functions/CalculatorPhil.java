package functions;

public class CalculatorPhil {
    public static String name ="ZeroX";
    public int version;

    public CalculatorPhil(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public static String getString() {
        return name;
    }

    public int add (int x, int y) {
        return x + y;
    }
    public int subtract (int x, int y) {
        return y - x;
    }
    public static int multiply (int x, int y) {
        return x * y;
    }
    public int divide (int x, int y) {
        return x / y;
    }
}
