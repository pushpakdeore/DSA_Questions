package pushpak41linearserchquation;
import java.util.*;

public class LinearQaution {
    //1Return the index of the element if found; otherwise, return -1.
    public static int findIndex(int [] arr,int t){
        for(int i =0;i<arr.length;i++){
            if(arr[i] ==t){
                return i;
            }
        }
        return -1;
    }
    //2. Search for a String in an Array
    //○ Implement a linear search to find a specific string in an array of strings. Return
    //the index of the string if found; otherwise, return -1.
    public static int stringIndex(String[] arr ,String t){
        for(int i =0;i<arr.length;i++){
            if(arr[i] ==t){
                return i;
            }
        }
        return -1;
    }
    //4. Count Occurrences of a Character in a String
    //○ Implement a linear search to count how many times a specific character appears
    //in a string.
    public static int countOccurrence(String[] arr ,String t){
        int c =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] ==t){
                c++;
            }
        }
        return c;
    }
    //5. Find Maximum Element in an Array
    //○ Write a method to find the maximum element in an array of integers using linear
    //search.
    public static int findMax(int [] arr){
        int max =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //6. Find All Occurrences in a List
    //○ Write a method to find all indices where a specific integer appears in an array.
    //Return a list of indices.
    public static List<Integer> findAllOccurrences(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }
    //7. Find the First Non-duplicate Character in a String
    //○ Implement a method to find the first non-duplicate character in a string using
    //linear search.
    public static char findNonDuplicate(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for ( char c: s.toCharArray()){
            if(map.get(c) ==1){
                return c;
            }
        }return ' ';




    }







    public static void main(String[] args) {
        //1
        int [] arr ={1,2,3,45,6,7,9,4,4,3};
        int target=3;
        int result = findIndex(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        //2
        String [] str = {"pushpak","Kunal","Harshal","Kunal"};
        String s ="Kunal";
        int r = stringIndex(str, s);
        if (r != -1) {
            System.out.println("Element " + s+ " found at index: " + r);
        } else {
            System.out.println("Element " + s + " not found in the array.");
        }
        //4

        int count =countOccurrence(str,s);
        System.out.println("count is :"+count);

        //5
        System.out.println("Max value in arr is :"+findMax(arr));

        //6
        List<Integer> re = findAllOccurrences(arr, target);
        if (!re.isEmpty()) {
            System.out.println("All occurrences of " + target + " found at indices: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }

        //7
        String stri = "swiss";
        char res = findNonDuplicate(stri);
        if (res != ' ') {
            System.out.println("The first non-duplicate character is: " + res);
        } else {
            System.out.println("No non-duplicate character found.");
        }
    }

}








