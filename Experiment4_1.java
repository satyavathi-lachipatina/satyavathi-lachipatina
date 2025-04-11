
 public class Experiment4_1 {
     public static void main(String[] args) {
         try {
             int result = 10 / 0; 
         } catch (ArithmeticException e) {
             System.out.println("Arithmetic Exception: " + e.getMessage());
         }
         System.out.println("Program continues after exception handling.");
     }
 }
