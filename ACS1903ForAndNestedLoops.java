
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Review
 * 
 * Description: Reveiw of 
 **********************************************************************/

// import statements go here
import java.util.Scanner;
//import javax.swing.JOptionPane;


public class ACS1903ForAndNestedLoops {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
    
    String prompt;             // used to prompt for input fromt the keyboard
    Scanner scanner = new Scanner(System.in);
    String strin;               // general string input
    String st;                  // general purpose strin variable
    
    // for this demo
    int count = 0;              // count how many time a loop iterates
    char ch;                    // for extracting chars from a string
      
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
    
    // simple for loop
    
    // for(int i = 50; i >=0; i -= 5){
        // System.out.println("iteration: " + i);
        // //System.out.println("iteration: " + (i + 1));
    // }// end for i

    // nested for loop
    // for(int i = 0; i < 4; i++){
        // System.out.println("i iteration: " + (i + 1));
        
        // for(int j = 0; j < 3; j++){
            // System.out.println("\tj iteration: " + (j + 1));
            // count++;        // count interations of the j (inner) loop
        // }//
    // }//end for i
    
    System.out.println("total iterations of the j loop = " + count);
    
    // for nested in a while
    
    prompt = "enter a word, quit to end";
    System.out.println(prompt);
    strin = scanner.next();
    
    while(!strin.equals("quit")){
        System.out.println(strin + "\n");
        
        // nested for
        for(int i = 0; i < strin.length(); i++){
            ch = strin.charAt(i);
            System.out.println(ch);
        }// end for int i
        // update the loop control
        System.out.println(prompt);
        strin = scanner.next();
    }// end while
    
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
