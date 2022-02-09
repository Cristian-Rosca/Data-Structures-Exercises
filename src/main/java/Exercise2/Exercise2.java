package Exercise2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

Given the follwing array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
Find the element that has the most number of occurences
Your method should return something like the 1 since it occurs 4 times
Think about the datastructure that you should use
Create a method. Think about the return type and parameters
Write unit tests for your method

 */
public class Exercise2 {

    public static void main(String[] args) {

        String initialInput = "1,1,1,1,3,4,5,6,7,7,7,8,8";

        // Convert the string into a string array. Split the string by ,
        String [] input = initialInput.split(",");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String e : input) {
            if (!hashMap.containsKey(e)) {
                hashMap.put(e, 1); // If e has not yet been added to the map keys, make it a key and add 1 as its value (1 instance of it)
            }
            else {
                hashMap.put(e,hashMap.get(e)+1);
            }
        }
        System.out.println(hashMap);




    }

}
