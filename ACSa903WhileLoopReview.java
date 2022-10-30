
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Review: while loop
 * 
 * Description: Reveiw of while loop basics
 **********************************************************************/

// import statements go here
import java.util.Scanner;
//import javax.swing.JOptionPane;


public class ACSa903WhileLoopReview {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
    
    String prompt;             // used to prompt for input fromt the keyboard
    Scanner scanner = new Scanner(System.in);
    String strin;               // general string input
    
    int n = 0;          // number read in from the keboard
    int sum = 0;        // sum of some numbers
    String st;
      
    // ***** get some input from the keyboard *****
    
    // prompt = " enter the  numbers you want to add up. Enter 0 to end";
    // System.out.println(prompt);
    
    // // read in the first number, this also primes the while loop
    // n = scanner.nextInt();
    
    // // ***** Processing *****
    
    // // now the while loop
    // while(n != 0){
        // sum += n;           //add up numbers
        
        // // update the conrol
        // //System.out.println(prompt);
        // n = scanner.nextInt();        
    // }// end while
    
    // // summary
    // System.out.println("sum = " + sum);
    
    
    
    // another variation
    
    prompt = "enter a phrase";
    System.out.println(prompt);
    strin = scanner.nextLine();         // read the whole line of text
    System.out.println(strin);           //make sure input is correct
    
    // // now make another scanner on the input string
    Scanner tokens = new Scanner(strin);
    
    while(tokens.hasNext()){
      st = tokens.next();
      System.out.println(st);
        
    }// end while
    
    
           
    // ***** output *****
    
    
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
