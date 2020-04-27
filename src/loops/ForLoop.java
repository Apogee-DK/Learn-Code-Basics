package loops;

public class ForLoop {
    public static void main(String[] args){

        // 1. Initialize index (if not setup) - int index = 0
        // 2a. State the condition
        // 2b. Execute code in for loop
        // 3. Increment index
//        for (int index = 0; index < 5; index=index+1) {
//            System.out.println(index);
//        }

        int[] arrayOfInts = new int[] {1,2,3,4,5};

        for (int i = 0; i < 5; i++) {
            if (arrayOfInts[i] == 3) {
                System.out.println("Do not print");
            } else {
                System.out.println(arrayOfInts[i]);
            }
        }
    }
}
