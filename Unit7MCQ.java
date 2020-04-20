
import java.util.ArrayList; 
/**
 * Write a description of class Unit7MCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7MCQ
{
    /** Precondition: firstList.size() == secondList.size() */
    ///////////////////Question 10////////////////////////
    //The method does not always work as intended.
    //For which of the following inputs does the method NOT return the 
    //correct value?
    /* 
     * A. When firstList is {1, 3, 3, 1} and secondList is {1, 3, 3, 1}
     * B. When firstList is {1, 3, 3, 1} and secondList is {3, 1, 1, 3}
     * C. When firstList is {1, 3, 5, 7} and secondList is {5, 5, 3, 1}
     * D. When firstList is {1, 3, 5, 7} and secondList is {7, 5, 3, 1}
     * E. When firstList is {1, 3, 5, 7} and secondList is {7, 5, 3, 3}
     */
    public static boolean isReversed(ArrayList<Integer> firstList,
    ArrayList<Integer> secondList)    
    {
        for (int j = 0; j < firstList.size() / 2; j++) {
            if (firstList.get(j) != 
            secondList.get(secondList.size() - 1 - j)) {
                System.out.println("false"); 
                return false;
            }
        }
        System.out.println("true)"); 
        return true;
    }

    public static void main(String[] args){
        //q10
        ArrayList<Integer> firstList = new ArrayList<Integer>(); 
        firstList.add(1); firstList.add(3); 
        firstList.add(5); firstList.add(7);

        ArrayList<Integer> secondList = new ArrayList<Integer>(); 
        secondList.add(5); secondList.add(5); 
        secondList.add(3); secondList.add(1);

        isReversed(firstList, secondList); 

        //C returns true when it should return false. The loop skips
        //over the last element of first list, giving a false positive. 

        /////////////q16 : testing the method with marker x
        int[] arr = {10, 8, 3, 4}; 
        insertionSort(arr); 

        /////////////q17 : testing method with marker y 
        int[] nums = {8, 7, 5, 4, 2, 1};
        insertionSort(nums); 
        
        /////////////q18 : testing the method with marker z
        int[] arr2 = {30, 40, 10, 50, 20};
        selectionSort(arr2);
    }
    //q15
    public int seqSearch(int[] arr, int target){
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                return j;
            }
        }
        return -1;
    }

    public int seqSearch2(int[] arr, int target) {
        for (int j : arr)
        {
            if (j == target)
            {
                return j;
            }
        }
        return -1;
    }
    //Which of the following best describes the difference in the 
    //behavior of seqSearch2 relative to seqSearch as a result of the 
    //modification?
    // A is wrong because seqsearch2 prints the actual value, seqsearch
    // prints the index where the value is, because of the for each loop.

    //E describes the difference between the two, shown when 
    //methods are run. 
    /* A. The modification in seqSearch2 has no effect:seqSearch2 will 
     * always behave exactly as seqSearch does.
     * B. The modification in seqSearch2 will cause a compilation error.
     * C. The modification in seqSearch2 will cause an 
     * ArrayIndexOutOfBoundsException to be thrown for some inputs.
     * D. The modification in seqSearch2 will cause -1 to be returned for 
     * all inputs.
     * E. The modification in seqSearch2 will cause the value of target to
     * be returned instead of the index of target in cases where target 
     * appears in arr.
     */

    /////////////////////////////q16,17,18/////////////////////////////

    //How many times is the statement possibleIndex--; in line 10 
    //How many times is the statement lements[possibleIndex] = temp; run
    //of the method executed as a result of the call to insertionSort ?
    public static void insertionSort(int[] elements) {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;   // line 10
                System.out.println("x"); 
            }
            elements[possibleIndex] = temp; // line 12
            System.out.println("y"); 
        }
    }
    // 5 "x" s are printed therefore the answer is D, 5 times. q 16
    // 5 "y" s are printed therefore the answer is C, 5 times. q 17
    public static void selectionSort(int[] elements)  {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            if (j != minIndex) {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp; //line 19
                System.out.println("z");
            }
        }
    }
    // 3 "z" s are printed therefore the answer is C, 3 times. q 18
}
