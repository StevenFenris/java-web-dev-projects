import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        //ArrayList<String> checkString = new ArrayList<>();
        HashMap<Character, Integer> checkStringHash = new HashMap<>(); //hashmap to be iterated
        Scanner input = new Scanner(System.in); //new scanner input
        String stringInput; //variable declaration



        System.out.println("Enter your String to check (ENTER to finish):"); //bonus mission 1, enter from cmd
        stringInput = input.nextLine(); //saves user input
        //int stringLength = stringInput.length();

        char[] charactersInString = stringInput.toCharArray(); //user input to char array

        for(char c : charactersInString){ //for every array entry
            if(checkStringHash.containsKey(c)){ //check hash for char
                int occurence = checkStringHash.get(c); //get occurence value from key(char)
                occurence++; //increment count
                checkStringHash.put(c, occurence); //place back into hashmap
            }else checkStringHash.put(c, 1); //create default hashmap entry if not present
        }

        System.out.println(checkStringHash); //print


    }
}
