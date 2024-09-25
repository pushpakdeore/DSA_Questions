package pushpak41linearserchquation;

public class BinarySearch {
    //1. Basic Binary Search in Sorted Array
    //○ Implement a binary search algorithm to find a specific element in a sorted array
    //of integers. Return the index of the element if found; otherwise, return -1.
    public static int findindex(int [] arr,int t){
        int left =0;
        int rigth = arr.length-1;
        while (left<=rigth){
            int mid = (left+rigth)/2;

            if(arr[mid] ==t){
                return mid;
            } else if (arr[mid]< t) {
                left =mid+1;
            }else{
                rigth =mid-1;
            }

        }return -1;
    }
    //3. Find the First and Last Occurrence of a Target Element
    //○ Implement a binary search to find the first occurrence of a target element in a
    //sorted array that may contain duplicates. Return the index of the first occurrence.
    //○ Write a method to find the last occurrence of a target element in a sorted array
    //that may contain duplicates. Return the index of the last occurrence.
    public static int firstOccurance(int []arr,int t){
        int left =0;
        int firstocc =-1;
        int rigth = arr.length-1;

        while (left<=rigth){
            int mid = (rigth+left)/2;
            if(arr[mid] == t){
                firstocc =mid;
                rigth =mid-1;
            } else if (arr[mid] <t) {
                left = mid+1;
            }else {
                rigth =rigth-1;
            }


        }return firstocc;
    }
    public static int lastOccurance(int []arr,int t){
        int left =0;
        int firstocc =-1;
        int rigth = arr.length-1;

        while (left<=rigth){
            int mid = (rigth+left)/2;
            if(arr[mid] == t){
                firstocc =mid;
                left =mid+1;
            } else if (arr[mid] <t) {
                left = mid-1;
            }else {
                rigth =rigth-1;
            }


        }return firstocc;
    }
    //4. Find the Smallest and Largest Element Greater than or Equal to the Target
    //○ Given a sorted array, write a method to find the smallest element that is greater
    //than or equal to a target value. Return its index.
    //○ Implement a binary search algorithm to find the largest element that is smaller
    //than or equal to a target value in a sorted array. Return its index.
    public static int findSmallestGreaterOrEqual(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low+high) / 2;

            if (arr[mid] >= target) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1; // Search on the right side
            }
        }
        return result; // Return the index of the smallest element >= target, or -1 if not found
    }

    public static int findLargestGreaterOrEqual(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                result = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }

        }
        return result;
    }
    //5. Check If a Target Element Exists in a Rotated Sorted Array
    //○ Write a method to determine if a target element exists in a rotated sorted array.
    //The array was originally sorted in ascending order but rotated at an unknown
    //pivot
    public static boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true;
            }

            //  left
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }//right
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }








    public static void main(String[] args) {
        //1 and 2 same
        int [] arr ={1,2,3,3,3,4,6,7,9};
        int target=3;
        System.out.println("index "+findindex(arr,target));
        //3
        System.out.println("first Occurrance index : "+firstOccurance(arr,target));
        System.out.println("Last occurance index : "+lastOccurance(arr,target));

        //4
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 15};
        int t =6;
        System.out.println("Index : "+findSmallestGreaterOrEqual(sortedArray,t));
        System.out.println("Index : "+findLargestGreaterOrEqual(sortedArray,t));

        //5
        int[] arrrotate ={4,5,6,7,1,2,3};
        System.out.println(search(arrrotate,34));


    }

}
