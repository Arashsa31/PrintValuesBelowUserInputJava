import java.util.Scanner; 

public class LabProgram119 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      /* Type your code here. */
      
      int tempValue = scnr.nextInt();      
      for (int i=0; i<tempValue+1; i++) {
    	  userValues[i] = scnr.nextInt();
      }      
      for (int i=0; i<tempValue; i++) {
    	  if(userValues[i] < userValues[tempValue])
    		  System.out.print( userValues[i]+ ",");
      }      
   }
}
