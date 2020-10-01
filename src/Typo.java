/**
the program that does the following:
*reads mistyped input (too far to the right) and ranslates it to the correct letters
*@author : Marwa Bouabid
*@version : 08/27/2020
*/

//Importing all the libraries we need 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Reads a file where the user's hands were one key to far to the right.
 * Outputs to standard output what the user intended to type.
 *
 */
public class Typo {
    // The map from mistyped characters to the intended characters.
    // TODO:  You need to initialize and use this map.
    private static Map<Character, Character> corrections = new HashMap<>();
    static { //the map initialization should be static in order for it to be accessed from other methods later 

        corrections.put('}', '{'); //.put assigns a value to every key of our HashMap 
        corrections.put('S', 'A');
        corrections.put('s', 'a');
        corrections.put('D', 'S');
        corrections.put('d', 's');
        corrections.put('F', 'D');
        corrections.put('f', 'd');
        corrections.put('G', 'F');
        corrections.put('g', 'f');
        corrections.put('H', 'G');
        corrections.put('h', 'g');
        corrections.put('J', 'H');
        corrections.put('j', 'h');
        corrections.put('K', 'J');
        corrections.put('k', 'j');
        corrections.put('L', 'K');
        corrections.put('l', 'k');
        corrections.put(':', 'L');
        corrections.put(';', 'l');
        corrections.put('\'', ':');
        corrections.put('\'', ';');
        corrections.put('|', '\'');
        corrections.put('\\', '\'');
        corrections.put('X', 'Z');
        corrections.put('x', 'z');
        corrections.put('C', 'X');
        corrections.put('c', 'x');
        corrections.put('V', 'C');
        corrections.put('v', 'c');
        corrections.put('B', 'V');
        corrections.put('b', 'v');
        corrections.put('N', 'B');
        corrections.put('n', 'b');
        corrections.put('M', 'N');
        corrections.put('m', 'n');
        corrections.put('<', 'M');
        corrections.put(',', 'm');
        corrections.put('>', '<');
        corrections.put('.', ',');
        corrections.put('?', '>');
        corrections.put('/', '.');
        corrections.put('2', '1');
        corrections.put('@', '!');
        corrections.put('3', '2');
        corrections.put('#', '@');
        corrections.put('4', '3');
        corrections.put('$', '#');
        corrections.put('5', '4');
        corrections.put('%', '$');
        corrections.put('6', '5');
        corrections.put('^', '%');
        corrections.put('7', '6');
        corrections.put('&', '^');
        corrections.put('8', '7');
        corrections.put('*', '&');
        corrections.put('9', '8');
        corrections.put('(', '*');
        corrections.put('0', '9');
        corrections.put(')', '(');
        corrections.put('-', '0');
        corrections.put('_', ')');
        corrections.put('=', '-');
        corrections.put('+', '_');
        corrections.put('W', 'Q');
        corrections.put('w', 'q');
        corrections.put('E', 'W');
        corrections.put('e', 'w');
        corrections.put('R', 'E');
        corrections.put('r', 'e');
        corrections.put('T', 'R');
        corrections.put('t', 'r');
        corrections.put('Y', 'T');
        corrections.put('y', 't');
        corrections.put('U', 'Y');
        corrections.put('u', 'y');
        corrections.put('I', 'U');
        corrections.put('i', 'u');
        corrections.put('O', 'I');
        corrections.put('o', 'i');
        corrections.put('P', 'O');
        corrections.put('p', 'o');
        corrections.put('{', 'P');
        corrections.put('[', 'p');
        corrections.put(']', '[');
        corrections.put(' ', ' ');



}
    
    
    public static void main (String[] args) {
        //Get the file name.  Exit if none was provided.
        if (args.length == 0) {
             System.out.println("Please enter a file name when you run the program");
                  return;
         }
        
         //Read and correct the file.
         try (Scanner in = new Scanner (new File (args[0]))) {
             while (in.hasNext()) {
                String corrected = correct (in.nextLine());
                System.out.println (corrected);
            }
         } catch (FileNotFoundException e) {
             System.out.println("File " + args[0] + " could not be found.");
         }
     }

    /**
     /* Correct one line by shifting the characters one to the left on the keyboard.
     * @param line the line that was mis-typed
     * @return the corrected line
     */
    private static String correct(String line) {
        // TODO:  You need to implement this method.
        String newline = ""; //creating a new string that is going to store our corrected line

        for (int i = 0; i < (line.length()); i ++) //looping through the characters of the line
        {
            char c = 0; //giving an random initial value to our character that will be called c 
            c = line.charAt(i); //c takes the value of the character at index i 
            c = corrections.get(c); //c takes the correspondant character of the Map
            newline = newline + c; //Adding our character to out corrected line
    }

    line = newline; //line becomes new line 
    return line; //returning the corrected line 
}
}