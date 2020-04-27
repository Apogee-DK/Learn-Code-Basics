package loops;

public class WhileLoop {
    public static void main(String[] args) {
        //  loops until the condition is false
        //        while(true) {
        //            // code loops forever
        //        }

        int[] arrayOfInts = new int[] {1,2,3,4,5};
        int sizeOfArray = arrayOfInts.length;
        int index = 0;

        while (index < sizeOfArray) {
            System.out.println(arrayOfInts[index]);
            index = index + 1;
        }
    }
}
