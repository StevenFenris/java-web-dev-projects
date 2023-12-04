import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        //ArrayList<String> checkString = new ArrayList<>();
        HashMap<Character, Integer> checkStringHash = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String stringInput;



        System.out.println("Enter your String to check (ENTER to finish):");
        stringInput = input.nextLine();
        //int stringLength = stringInput.length();

        char[] charactersInString = stringInput.toCharArray();

        for(char c : charactersInString){
            if(checkStringHash.containsKey(c)){
                int occurence = checkStringHash.get(c);
                occurence++;
                checkStringHash.put(c, occurence);
            }else checkStringHash.put(c, 1);
        }

        System.out.println(checkStringHash);


    }
}