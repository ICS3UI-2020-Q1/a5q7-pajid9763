import java.util.Scanner;
/**
 * program that creates empty box stars
 * @author Darian 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask them for a number between 1-10
    System.out.println("Please enter a number between 1 and 10");
    int num = input.nextInt();
    
     
    for (int i = 1; i <= num; i++){

      for (int j = 1; j <= num; j++){
        
        // print * if i = 1 or i = num
        if (i == 1 || i == num)
          System.out.print("*");
        
        // print * if j = 1 or j = num
        else if (j == 1 || j == num)
          System.out.print("*");

        // if it isn't either print a blank space
        else 
          System.out.print(" ");
        


      }
      // print an empty line so the next row of stars can be printed
      System.out.println(" ");
    }
  
    
  }
}
