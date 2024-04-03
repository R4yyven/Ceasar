import java.util.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* Ini */
        Scanner scanner = new Scanner(System.in);
        int key;
        key = 5;
    

        System.out.println("Type in the phrase to be encrypted:");
        String input = scanner.nextLine();
        System.out.println(input);

        String ciphertxt = code(input, key);
        System.out.println("Klartext " + input + "--->" + ciphertxt);

        key = 8;
        ciphertxt = code(input, key);
        System.out.println("Klartext " + input + "--->" + ciphertxt);

    }

    public static String code(String input, int key) {
        String ciphertxt = "";          /*String initialisiert */
        input = input.toLowerCase();/*String zu lowercase */
        for(int i=0; i<input.length(); i++){ 
            char next = input.charAt(i);   /*gibt mir den buchstaben an einer bestimmten stellen */
            ciphertxt = ciphertxt + shift(next, key); 
        } 
        return ciphertxt;
    }

    public static char shift(char letter, int shift) {
        if(letter >= 'a' && letter <='z'){
            letter += shift;
            while (letter >'z'){
                letter -= 26;
            }
        }
        return letter;
    }

}