package functions;

public class CalculatorPhil {
    public static String Zero;
    public int version;

    public CalculatorPhil(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public static String getString() {
        return Zero;
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
