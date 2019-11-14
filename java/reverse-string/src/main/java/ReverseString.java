import java.lang.reflect.Array;
import java.util.*;
class ReverseString {

    public static String reverse(String inputString) {
        String newString = "";
        for (int i = 0;i < inputString.length(); i++){
            System.out.println(inputString.charAt(i));
            newString = inputString.charAt(i) + newString;

        }
        System.out.println(newString);


        return newString;
    }
  
}