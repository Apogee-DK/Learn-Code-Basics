package functions;

public class DriverPhil {

    public static void main(String[] args){
        int x = 5;
        int y = 10;

        int result = CalculatorPhil.multiply(x,y);{
            System.out.println(result);
        }

        CalculatorPhil calculatorZerox = new CalculatorPhil(77);
        int result1 = calculatorZerox.divide(y,x);{
            System.out.println(result1);
        }
        int result2 = calculatorZerox.subtract(y,x);{
            System.out.println(result2);
        }
        int result3 = calculatorZerox.add (x,y);{
            System.out.println(result3);
        }
        int Version = calculatorZerox.getVersion();{
            System.out.println(Version);
        }
        String Name = CalculatorPhil.getString();{
            System.out.println(Name);
        }
    }
};

//HOW DO YOU MAKE A FUNCTION TO GET THE NAME OF THE CALCULATOR?
// I TRIED: String Name = CalculatorPhil.getString();{
        //System.out.println(Name);}
//Did not work. I made the String static too.
