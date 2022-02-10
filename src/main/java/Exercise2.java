/*

Given the follwing array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
Find the element that has the most number of occurences
Your method should return something like the 1 since it occurs 4 times
Think about the datastructure that you should use
Create a method. Think about the return type and parameters
Write unit tests for your method

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Exercise2 {
    public static void main(String[] args) {

        String initialInput = "1,1,1,1,3,4,5,6,7,7,7,8,8,9";

        // Convert the string into a string array. Split the string by ,
        String[] input = initialInput.split(",");

        HashMap<String, Integer> hashMap = new HashMap<>();

        Exercise1.countStringFrequency(input, hashMap);


        // Hashmap will print a set of keys and set of values which count the frequency of the String

//        for (int i = 0; i < hashMap.values().size(); i++) {
//            int highestFrequency = 0;
//            if (hashMap.values()[i] > highestFrequency) {

        int highestFrequency = 0;

        // foreach loop through the hashmap - using method 2 from video
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
            }
        }



        // creating blank list to add the keys corresponding to the highest value
        List<String> list = new ArrayList<>();


        // create a for loop that goes through the hashmap and adds the key with a value that = highestFrequency

        for (Map.Entry<String,Integer> val : hashMap.entrySet()) {
            if (val.getValue() >= highestFrequency) {
                list.add(val.getKey());
            }
        }

        System.out.println(list);

    }
}
