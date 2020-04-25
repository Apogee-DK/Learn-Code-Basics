package variables;

import variables.exazades.VariableTypesTesuji;

public class VariableAssignment {

    public static void main(String[] args) {
        // Primitive types
        int variable1 = 1;
        int variable2 = 2;
        // ...
        int result = add(variable1, variable2); // 1 + 2
        double doubleValue = 2.00102310230123 + result; // more precision
        int subtraction = subtract(variable2, variable1);

        float floatValue = 2.00343959f; // less precision
        long longValue = 23492l;
        boolean trueOrFalse = false;

        // Non-Primitive Types
        String propertyStr = "This is a string" + " yeah i know";
        String propertyStr2 = "This is a string yeah i know";

        // int[] arrayOfInts = new int[5];
        // Before new int[5]
        // x x x x x x x x x x x

        // After new int[5] is executed
        //mem - - - - - x x x x x x
        //loc 0 1 2 3 4 5 6 7 8 9 10
        // arrayOfInts == 0

        int[] arrayOfInts = new int[] {10, 20, 30, 40, 50};

        //mem 10 20 30 40 50  x  x  x  x  x  x
        //loc 00 01 02 03 04 05 06 07 08 09 10
        // arrayOfInts == 00 (memory location)

        // To access a value in an array, we use an index which has to be an integer -> array[index]
        int firstValue = arrayOfInts[0];
        int secondValue = arrayOfInts[1];
        int thirdValue = arrayOfInts[2];
        int fourValue = arrayOfInts[3];
        int fifthValue = arrayOfInts[4];
        // int sixthValue = arrayOfInts[5]; // this will give you an exception
        // int impossibleValue = arrayOfInts[-1]; // this will give you an exception

        // int someInt = 10;
        // int value = arrayOfInts[someInt]; // this will give you an exception

        // One way to think value access is as such:
        //mem 10 20 30 40 50
        //loc 00 01 02 03 04
        // arrayOfInts + index -> retrieve valueß
        // 0           + 0     -> 10

        /*  This is a huge comment about types

        Primitive types
        variable1 === 1
        variable2 === 2

        variable1 == variable2 -> false

        Non-primitive types (Reference)
        loc         value
        0130301 -> "This is a string"
        0130302 -> " yeah i know"

        >>> apply transformation
        0130303 -> "This is a string yeah i know"
        propertyStr === 0130303

        0130304 -> "This is a string yeah i know"
        propertyStr2 === 0130304

        propertyStr == propertyStr2 -> false
        propertyStr.equals(propertyStr2) -> true

         */

        /**
         * propertyVariableType this is a property for the variable assignment class
         */
        VariableTypesTesuji propertyVariableType = new VariableTypesTesuji();
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }
}
