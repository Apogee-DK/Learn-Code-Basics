package object.reference;

public class ObjectReference {
    public static void main(String[] args) {
        /*
        Primitive types
        variable1 is equal 1
        variable2 is equal 2

        variable1 == variable2 returns false
         */
        int variable1 = 1;
        int variable2 = 2;
        boolean isIntEqual = variable1 == variable2; // returns false


        /*
        Non-primitive types (Reference)
        loc         value
        0130301 -> "This is a string"
        0130302 -> " yeah i know"

        >>> apply transformation
        0130303 -> "This is a string yeah i know"
        propertyStr is equal to the memory location 0130303

        0130304 -> "This is a string yeah i know"
        propertyStr2 is equal to the memory location 0130304

        propertyStr == propertyStr2 returns false as the memory location value is not equal.

        The following is equal because it is using its function to determine equality.
        propertyStr.equals(propertyStr2) returns true
        */
        String propertyStr = "I am a" + " reference";
        String propertyStr2 = "I am a reference";
        boolean isStrReferenceEqual = propertyStr == propertyStr2; // returns false
        boolean isStrEqual = propertyStr.equals(propertyStr2); // returns true

        // Arrays

        int[] ints = new int[5];
        // Before new int[5]
        // x x x x x x x x x x x

        // After new int[5] is executed
        //mem - - - - - x x x x x x
        //loc 0 1 2 3 4 5 6 7 8 9 10
        // arrayOfInts is equal to the first value's memory location 0

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
        // arrayOfInts + index -> retrieve value
        // 0           + 0     -> 10
    }
}
