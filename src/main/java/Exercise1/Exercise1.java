package Exercise1;

/*
Given the follwing array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
Find the number of occurences for each element

 Your method should return something like the following:


{
    "1": 4,
    "3": 1,
    "4": 1,
    "5": 1,
    "6": 1,
    "7": 3,
    "8": 2
}

Think about the data-structure that you should use

Create a method. Think about the return type and parameters
Write unit tests for your method

 */

import java.util.HashMap;

public class Exercise1 {

    public static void main(String[] args) {
        String initialInput = "1,1,1,1,3,4,5,6,7,7,7,8,8";

        // Convert the string into a string array. Split the string by ,
        String [] input = initialInput.split(",");

        HashMap<String, Integer> hashMap = new HashMap<>();


        countStringFrequency(input, hashMap);

        System.out.println(hashMap);
    }


    public static void countStringFrequency(String[] input, HashMap<String, Integer> hashMap) {
        for (String e : input) {
            if (!hashMap.containsKey(e)) {
                hashMap.put(e, 1); // If e has not yet been added to the map keys, make it a key and add 1 as its value (1 instance of it)
            }
            else {
                hashMap.put(e, hashMap.get(e)+1);
            }
        }
    }

}
