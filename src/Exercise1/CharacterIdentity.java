package Exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CharacterIdentity {

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
            char c = userInput.charAt(i);

            //checks whether character is uppercase
            if (Character.isUpperCase(c)){
                System.out.println(c+" : uppercase");

                //checks whether character is lowercase
            }else if (Character.isLowerCase(c)){
                System.out.println(c+" : lowercase");

                //checks whether character is numeric
            }else if (Character.isDigit(c)){
                System.out.println(c+" : numeric");
            }


        }
    }
}