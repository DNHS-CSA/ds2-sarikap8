/**
 * Write a description of class Unit6MCQ here.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6MCQ
{
    public static void main(String[] args){
        ///////////////////////Question 7///////////////////////

        //Which of the following best identifies why the code segment 
        //does not work as intended?
        /*
         * A. In the for loop header, the initial value of j should be 0.
         * B. In the for loop header, the initial value of j should be 2.
         * C. The for loop condition should be  j < fibs.length - 1.
         * D. The for loop condition should be  j < fibs.length + 1.
         * E. The for loop should increment j by 2 instead of by 1.
         */

        int[] fibs = new int[10];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int j = 2; j < fibs.length; j++) {
            fibs[j] = fibs[j - 2] + fibs[j - 1];
        }
        //print loop elements to check
        for (int i : fibs) {
            System.out.println(i); 
        }
        //when the loop is run as-is, there is an out of bounds error 
        //since the loop searches for fibs[-1]. 
        //changing j to initially be 2 avoids that error. 
        //C is incorrect because the loop would miss the last number. 

        ////////////////////////Question 10////////////////////////////
        int[] arr = {1, 2, 3, 4, 5};
        //segment 1
        for (int x = 0; x < arr.length; x++) {
            // System.out.print(arr[x + 3]);
        }
        // segment 2
        for (int x : arr) {
            System.out.print(x + 3);
        }
        //Segment 1 gives an Out of Bounds Exception because the third 
        //element makes the program run arr[6] which is out of bounds. 

        //Segment 2 prints each element in the array + 3 giving 45678
        /////////////////////Question 11//////////////////////
        //which of the following will help the segment work as intended:
        /* A. for (int y = 0; y <= arr.length; y++)
         * B. for (int y = 0; y < arr.length; y++)
         * C. for (int y = x; y < arr.length; y++)
         * D. for (int y = x + 1; y < arr.length; y++)
         * E. for (int y = x + 1; y <= arr.length; y++)
         */
        boolean duplicates = false;
        int[] array = { 1, 1, 2, -3, 4, }; //made an array to test loop
        for (int x = 0; x < array.length - 1; x++) {
            for (int y = x + 1; y < array.length; y++){
                if (arr[x] == array[y]){
                    duplicates = true;
                }
            }
        }
        System.out.println(duplicates); 
        //option E is wrong because there will be an out of bounds 
        //exception after the iteration of the outer loop the first time. 
        //option D is correct, shown when run.
        
        //testing question 14 below
        positionOfFirstNegative(array); //tested with all positive, fail
        //then tested with 1 negative, worked 
    }
    //////////////////////////////Question 14////////////////////////
    
    public static int positionOfFirstNegative(int[] values) {
        int index = 0;
        while (values[index] >= 0){
            index++;
        }
        return index;
    }
    //What precondition is needed? 
    /* A. The array values must contain at least one negative integer.
     * B. The array values must contain at least one nonnegative integer.
     * C. The array values must contain at least one positive integer.
     * D. No precondition is needed. The method will never work as intended.
     * E. No precondition is needed. The method will always work as intended.
     */
    // A precondition is needed, so D and E are wrong. 
    // C is wrong because the loop will keep incrementing index until 
    // there is an out of bounds error, so A is the correct answer. 
}