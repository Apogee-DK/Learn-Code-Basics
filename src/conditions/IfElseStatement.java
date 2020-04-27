package conditions;

public class IfElseStatement {
    public static void main(String[] args){

        boolean firstCondition = true;
        boolean secondCondition = true;

        int integer1 = 1;
        int integer2 = 2;

        boolean areIntegersEqual = integer1 == integer2;

        if (integer1 == integer2) {
            System.out.println("Integers are equal");
        }
        else {
            System.out.println("Integers are not equal");
        }


        if (firstCondition) {

        }
        else if (secondCondition) {

        }
        else {

        }

        int result = 1;

        switch (result) {
            case 1:
                System.out.println("It is 1");
                break;
            case 2:
                System.out.println("It is 2");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            default:
                System.out.println("Does not match");
                break;
        }
    }
}
