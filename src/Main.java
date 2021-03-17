import java.util.*;

public class Main {

    //Brute-force approach when I tried the question for the first time
    private static int[] alternativeValuesOfNestedArray(int[][] numbers){
        //Declaring empty array to hold the result
        int[] output = {};
        //Loop through the given double array to determine the size of the
        //Output array to hold the result
        for (int k = 0; k < numbers.length; k++) {
            for (int z = 0; z < numbers[k].length; z++) {
                //For odd size of double arrays
                if(numbers[k].length > numbers.length)
                    output = new int[numbers[k].length * numbers[k].length];
                else
                    //Otherwise the array is even size
                    output = new int[numbers.length * numbers.length];
            }

        }
        int n = 0;
        //Loop through the given double array to find the coordination of
        //the row and column of the array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //Creating Temporary variable to hold each coordinate value
                int temp = numbers[i][j];
                int m = i;
                //find the zero column
                if(m == 0 && j == 0) {

                    output[j] = temp;
                }
                //traverse through next row
                else if(j == 0){

                    output[i] = temp;
                }
                else{
                    //traverse through next column
                    if(j == 1)
                    output[(numbers.length)+m] = temp;
                    else {
                        //Traverse through the columns which are more than or equal to 2
                        if (j >= 2) {
                            //Calculating the value of the row for more than 2 columns
                               if(m>=0 && j > 2){
                                    m = n -1;
                               }
                             //To find the index for the last column value based on the number of columns
                            n = m + j + 1;
                            output[(numbers.length) + n] = temp;

                        }

                    }
                }
            }

        }
        return output;
    }
    //Improving the Time complex on the brute-force algorithm
    private static int[] print2dMatrix(int[][] arr){
         //Calculating the row and column length
        int rows = arr.length;
        int columns = arr[0].length;
        //Array to hold the result
        //The length of the result array is row * column
        int[] output = new int[rows * columns];
        //Variables to determine exact index for row and column values
        //in the result array
         int n = rows;
         int m = 2*rows;
         int y = (output.length - rows);
         int x = y+rows;
         //loop through the given double array
        for (int i = 0; i < rows * columns; i++) {
            //Calculating the coordinates for row and column
            int row = i/columns;
            int col = i%columns;
            //Finding the zero column and adding to output array
            if(row >= 0 && col == 0) {

                 output[row] = arr[row][col];

            }
            //Finding the first column and adding to the output array
            if (row >= 0 && col == 1) {

                output[n++] = arr[row][col];
            }
            //Finding the second column and adding to the output array
            if(row >= 0 && col == 2){
                output[m++] = arr[row][col];
            }
            //Finding the third and above column and adding to the output array
            if(row >= 0 && col >= 3 ) {
                //Based on the number of the rows determine the column location
                if (col <= rows) {
                    output[y++] = arr[row][col];
                }
                else if (col <= columns - 1) {

                    output[x++] = arr[row][col];
                }
            }

        }

        return  output;
    }




    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,2};
        int[] num3 = {6,2,7};
        int[][] arr = {num1,num2,num3};
        System.out.println("The brute-force approach: ");
       System.out.println(Arrays.toString(alternativeValuesOfNestedArray(arr))+"\n");
        System.out.println("A solution after improving time complexity : ");
        System.out.println(Arrays.toString(print2dMatrix(arr)));

    }
}
