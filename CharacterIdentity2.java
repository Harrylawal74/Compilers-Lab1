import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CharacterIdentity2 {

    public static void main(String[] args) {


        //initiation of variable 'userInput'
        String userInput = "";
        //initiation of variable 'charClass'
        String charClass = "";
        //
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = reader.readLine();
        }
        // if the user input is invalid then an error message is displayed
        catch (IOException ex) {
            System.err.print("Input error!");
            ex.printStackTrace();
            System.exit(1);
        }

        //for loop that iterates the length of the users input
        for (int i = 0; i < userInput.length(); ++i) {


                //The charAt() method returns the character at the specified index in a string.
            char character = userInput.charAt(i);

            //assigns Unicode value of character to 'characterCode'
            int characterCode = userInput.charAt(i);


            //if the character is within these values then it is A-Z, a-z or numeric
            if (characterCode >= 64 && characterCode<=90 ||
                    characterCode >= 97 && characterCode <= 122 ||
                    Character.isDigit(character)) {
                
                //checks whether character is uppercase
                if (Character.isUpperCase(character)) {
                    System.out.println(character + " : uppercase");

                    //checks whether character is lowercase
                } else if (Character.isLowerCase(character)) {
                    System.out.println(character + " : lowercase");

                    //checks whether character is numeric
                } else if (Character.isDigit(character)) {
                    System.out.println(character + " : numeric");

                }

            //if character Unicode value is within these values then output is 'Punctuation'
            }else if (characterCode >= 33 && characterCode <= 47 ||
                    characterCode >= 58 && characterCode <= 64 ||
                    characterCode >= 91 && characterCode <= 96 ||
                    characterCode >= 123 && characterCode <= 126){
                System.out.print(character+" : Punctuation\n");

                //if character's Unicode value is above 127 then output error message 
            }else if (characterCode > 127){
                System.out.print("unprintable");
            }
        }
    }
}
