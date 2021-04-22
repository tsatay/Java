import java.util.Arrays;

public class Main {
         public static double[] averageValues(int[] values){
             //Array to hold the average of each values sum
             double[] result = new double[values.length];
             //A value to hold each addition
              int sum = 0;
              double y = 0.0;
             //Loop through the given array values
             for (int i = 0; i < values.length; i++) {
                 //Add each value of the array
                 sum += values[i];
                 //Counting each value that being add
                 y = i+1;
                 //Placing each running average in the new array
                result[i] = sum/y;

             }
             //Saving the array which holds each running average in the memory
             return result;
         }
    public static void main(String[] args) {
         //Values to test out app
       int[] numbers = {1,2,3,4,5};
       int[] numbers2 = {3,3,1,4,5};
         //Display the output
        System.out.println(Arrays.toString(averageValues(numbers)));
        System.out.println(Arrays.toString(averageValues(numbers2)));

    }
}
