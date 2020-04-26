package functions;

public class Calculator {

    public static void main(String [] args) {
        int variable1 = 1;
        int variable2 = 2;

        int result = add(variable1, variable2); // 1 + 2
        int subtraction = subtract(variable2, variable1);
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }
}
