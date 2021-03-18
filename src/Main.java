import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
       1)Divided the array into two
            -comparing the value of two side with the middle value
            -if the value of either side is greater, assign the value to a variable
       2) loop through until a largest value in the array
            -find a sum from initial value of the array to a largest value
            -find a sum from a largest value index to the end of the array

       3) Compare the two sum values

       4) return a largest sum

     */
    private static int largestContiguousSum(int[] arr){
        //Find the middle index of the array
        int middleIndex = (arr.length)/2;
        //Assign the middle value of the array to a variable
        int middleNum = arr[middleIndex];
        //Assign one lower than the middle index to a variable
        int i=middleIndex - 1;
        int j;
        //Checking the size of the array if it is even or odd
        //Based on the type of array's size, decide what will be the
        //second index and assigned to a variable
        if((arr.length)%2 != 0){
            //The size of the array is odd and the second index will be an index
            // one more than the middle index
            j = middleIndex + 1;
        }
        else {
            //The size of the array is even, the second index will be the middle index
            j = middleIndex;
        }
        //Assign the middle index's value to a variable
        int temp = middleNum;
        //loop half way
        while(i >=0 && j < arr.length ){
             //Checking the first half that is less than middle value
            if(arr[i] > temp && arr[i] > arr[j] ){

                   temp = arr[i];
                    middleIndex = i;
               }
               else{
                   //Checking the other half which is greater than the middle value
                   if(arr[j] > temp && arr[i] < arr[j]) {

                           temp = arr[j];
                           middleIndex = j;
                            }
                   }
                        i--;
                        j++;
               }
        int sum1 = 0;
        int sum2 = 0;
        //Loop through the first half and add each value
        for (int k = 0  ; k <= middleIndex; k++) {

                sum1 += arr[k];
        }
        //Loop through the second half and add each value
        for (int z= middleIndex; z < arr.length ; z++) {
                sum2 += arr[z];
        }
        //Comparing the first and second sum to determine a largest contiguous sum
        if (sum1 > sum2) {
            //Store the value of the first sum and
            return sum1;
        }
        //Store the value of the second sum and use it to display it
         return sum2;
        }
      //Find a duplicate numbers in the array
      private static List<Integer> duplicateValue(int[] numbers){
        //Creating list to hold the result
          ArrayList<Integer> list = new ArrayList<>();
          //Loop through the given array
          for (int i = 0; i < numbers.length; i++) {
                   // Checking the value of an array if it is negative
                  //if the value is negative, it indicates the value is a duplicate value
                   if(numbers[Math.abs(Math.abs(numbers[i]))] < 0) {
                       list.add(Math.abs(numbers[i]));

                   }
                   //Else use that value to locate the index in the array
                   // to change the value at that index
                   else {
                       numbers[Math.abs(Math.abs(numbers[i]))]= -numbers[Math.abs(Math.abs(numbers[i]))];
                   }
          }
                   //finally sort a duplicate values in the list
                  Collections.sort(list);
          return list;
      }


    public static void main(String[] args) {
        //Creating the array for Testing purpose
        int[] numbers = {1, 2, 3, 4, 100, -5, -10, 7};
        //Display the result by calling the largestContiguousSum
        System.out.println("The largest contiguous sum: ");
        System.out.println(largestContiguousSum(numbers)+"\n");
        int[] arr ={1,2,3,5,6,7,8,0,2,1,3,0};
        System.out.println("Duplicate values in the array: ");
        System.out.println(duplicateValue(arr));
    }
}
