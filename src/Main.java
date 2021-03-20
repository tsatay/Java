import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
       1)Assign the first value in the array to temporary variable
       2) Loop through in the array and add each value and assigned to some variable
       3)Compare the new sum value to a temp variable.
              -If a new sum is greater or equal to temp variable, the new temp will be the new sum
              -Else continue to a next value in array using the loop

       3) return temp which will be a largest contiguous sum

         */

      private static int largestConSum(int[] array){
         //Creating temporary variable to Hold the value of the first value in the array
        int temp = array[0];
        //Initialize a value with zero to hold a sum
        int sum = 0;
        //Loop through until the end of the array
          for (int i = 0; i < array.length; i++) {
              //Adding each value in array
              sum += array[i];
              //Checking the the new sum is greater or equal to temporary variable
              //if it is greater than the temp, the sum will be the next value
              if(sum >= temp){
                  temp = sum;
              }
          }
          //Saving the largest contiguous sum
          return temp;
      }


    public static void main(String[] args) {
        //Creating the array for Testing purpose
        int[] numbers = {1, 1, 1, 1, 1, 1, -30, -29, 5, -7, -3, -4};
        int[] numbers1 = {1, 2, 3, 4, 100, -5, -10, 7};
        int[] num = {-1,1,5,1,1,1,-30,-29,10,-7,-3,-4};
        //Display the result by calling the largestContiguousSum
        System.out.println("The largest contiguous sum: ");
        System.out.println(largestConSum(numbers)+"\n");
        System.out.println(largestConSum(numbers1)+"\n");
        System.out.println(largestConSum(num)+"\n");


    }
}
