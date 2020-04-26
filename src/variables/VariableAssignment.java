package variables;

import variables.exazades.VariableTypesTesuji;

public class VariableAssignment {

    /*
    Primitive types are the most basic data types in the Java language
    int, float, long, double boolean, byte, short, char

    Non-primitive types are reference data types. The variables do not hold
    the value, instead they hold the reference (address to which the actual
    is stored).
     */
    public static void main(String[] args) {
        // 1. Let's begin by diving into the syntax for assigning values to variable names

        // You will always need to specify the type and then the variable name, as such:
        int value;

        // You also have the option to assign a value to the variable name:
        int variable1 = 1;
        int variable2 = 2;
        double doubleValue = 2.00102310230123; // more precision
        float floatValue = 2.00343959f; // less precision
        long longValue = 23492l;
        boolean trueOrFalse = false;
        char character = 'a';

        // Variable has certain restrictions:
        // - Cannot start with a digit
        // - Cannot contain special characters
        // - Cannot be conflicting with any java annotation, types, or classes

        // 2. Precision matters as types with more precision cannot be cast to a type with less precision

        // Assignment will fail as a double cannot be cast to an int as we will lose the decimal digits
        // int doubleValue = 1.0;

        // 3. Non-Primitive Types are reference data, so the variable do not hold the "value" which you define.
        // Instead, they hold the reference to the value.
        String propertyStr = "This is a string" + " yeah i know";
        String propertyStr2 = "This is a string yeah i know";

        // 4. Arrays
        // The following creates an array which can hold up to 5 integers
        int[] ints = new int[5];

        // 5. Object creation
        // Using "new your-class-name()" will instantiate an object of that specific class. This is called a constructor.
        VariableTypesTesuji propertyVariableType = new VariableTypesTesuji();
    }
}
