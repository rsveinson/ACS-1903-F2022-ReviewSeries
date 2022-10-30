
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Review Static Methods
 * 
 * Description: Reveiw of static methods
 **********************************************************************/

// import statements go here
import java.util.Scanner;
//import javax.swing.JOptionPane;


public class ACS1903StaticMethodReview {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
    
    String prompt;             // used to prompt for input fromt the keyboard
    Scanner scanner = new Scanner(System.in);
    String strin;               // general string input
    String st;                  // general purpose strin variable
    
    // for this demo
    String password;            // pw entered from the keyboard
    String securePassword;      // password after simple encryption
      
    // encrypt the password
    prompt = "enter your password";
    password = getPassword(scanner, prompt);
    //System.out.println(password);
    
    securePassword = encrypt(password);
    //System.out.println(securePassword);
    
    printSummary(password, securePassword);
           
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
    // staic methods
    public static void printSummary(String pw, String epw){
        System.out.println("Password: " + pw);
        System.out.println("Encrypted Password: " + epw);
    }// end print summary
    
    public static String encrypt(String pw){
        String epw = "";
        char ch = 'm';
        
        for(int i = 0; i < pw.length(); i++){
            ch = pw.charAt(i);
            
            if(Character.isUpperCase(ch)){
               epw += Character.toLowerCase(ch); 
            }// end ch is upper case
            else{
                epw += Character.toUpperCase(ch);
            }// end lower case
        }// end for
        
        return epw;
    }// end encrypt
    
    public static String getPassword(Scanner s, String p){
        String pw = null;
        
        System.out.println(p);
        pw = s.next();
        
        return pw;
    }// end getPassword
    
    
} // end of public class
