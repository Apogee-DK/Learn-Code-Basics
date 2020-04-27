package conditions;

public class IfElseStatement {
    public static void main(String[] args){

        boolean firstCondition = true;
        boolean secondCondition = true;

        int integer1 = 1;
        int integer2 = 2;

        boolean areIntegersEqual = integer1 == integer2;

        /*
         Operators:
         == (equal)
         > (bigger than)
         < (smaller than)
         <= (smaller than or equal)
         >= (bigger than or equal)
         != (not equal)
         */

        /* This is the structure of an if-else statement
        if (<condition>) {
           // your code
        }
        else {
           // your code
        }

        The if statement takes in a condition which you define. The condition has to return true or false. Basically, the
        value of `condition` is a boolean type.

        The code within the if statement will only execute when the condition is satisfied. If it is not satisfied, then
        the code within the else statement will be executed.

        if (<condition>) {
           // code executes when condition is true
        }
        else {
           // code executes when condition is false
        }
        */
        if (integer1 == integer2) {
            System.out.println("Integers are equal");
        }
        else {
            System.out.println("Integers are not equal");
        }

        /*
        It is also possible to define additional if statements by adding `else if` to the statement

        if (<condition1>) {
           // code executes when condition1 is true
        }
        else if (<condition2>) {
           // code executes when condition2 is true
        }
        else {
           // code executes when condition1 and condition2 are false
        }

        You can have many more `else if` statements as required.
        */
        if (firstCondition) {

        }
        else if (secondCondition) {

        }
        else {

        }

        // Please note: the code block of if, else if and else statements will be skipped as soon as a condition is satisfied

        /*
        if (<condition1>) {
           // code executes when condition1 is true
           // else if and else will not be evaluated
        }
        else if (<condition2>) {
           // code executes when condition2 is true
           // else will not be evaluated
        }
        else {
           // code executes when condition1 and condition2 are false
        }
        */

        int result = 1;

        /*
           Switch statements are very similar to if-else statements. Only difference is that the input is not a condition
           but the value to which you are trying to compare to.

           switch(<your value>) {
                case <value to compare>:
                    <statement>
                case <value to compare>:
                    <statement>
                ...
                default:
                    <statement>
           }

           You can have as many cases as you want, and each case contains a statement. Please note that you will need
           a `default` which basically implies that if the value you had input does not match any of the cases specified,
           the `default` statement will be executed.

           Additionally, think of the switch statement as a waterfall. If you do not put `break;` after each case statement,
           all other cases will be executed until it hits a `break` or until the switch statement ends.

           case <value>:
                <statement>
                break; // to prevent any further checks
         */
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
