package functions;

public class CalculatorXavier {
 public String name;
 public int version;

 public CalculatorXavier() {
  this.version = 0;
 }

 public CalculatorXavier(int version) {
  this.version = version;
 }

 public int getVersion() {
  return version;
 }

 // public, private, protected
 // static: You don't have to create the object to use it.
 public static int add(int x, int y) {
  return x + y;
 }

 public static int subtract(int x, int y){
  return x - y;
 }

 public static double divide(int x, int y) {
  return x / y;
 }

 public static int multiply(int x, int y) {
  return x * y;
 }
}




