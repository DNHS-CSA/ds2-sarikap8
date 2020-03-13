public class Unit1MC
{
    public static void main(String[] args) {
        ///////////////////////////////////////////////////1.3////////////////////////////////////////////////////
        //Question : Which of the following arithmetic expressions evaluates to 1 ? 
        /* options : 
         * 
         * I. 2/ 5 % 3 
         * II. 2 / (5%3) 
         * III. 2/5 + 1
         * A = I only 
         * B = II only 
         * C = I and II only 
         * D = II and III only <-- ANSWER
         * E = I, II, and III 
         */
        System.out.println(2/5%3); 
        System.out.println(2/(5%3)); 
        System.out.println(2/5 + 1); 

        //Through testing, we can see that option 1 gives 0 as an output, options 2 and 3 give 1. 
        // because % and / are the same "level" option A moves left to right, using casting to become 0%3 = 0.
        
        ///////////////////////////////////////////////////1.5 2B/////////////////////////////////////////////////
        //Question: What is printed as a result of executing the code? 
        /* options: 
         * A = -2 
         * B = -2.5 <-- ANSWER
         * C = -3 
         * D = -3.25
         * E = Nothing is printed because an int cannot be subtracted from a double. 
         */
        double d = 0.25; 
        int i = 3; 
        double diff = d - i; 
        System.out.print((int)diff - 0.5); 
        //Through testing, we can see that -2.5 is printed, so the answer is option B. 
        // diff = -2.75 after initially subtracting 
        // As an int, -2.75 becomes -2
        // -2 - 0.5 is a double so the answer is -2.5
        
        ///////////////////////////////////////////////////1.5 5B/////////////////////////////////////////////////
        //Question: Which of the following best describes the error, if any, in the code segment? 
        /* options: 
         * A = There are no errors and the code works as intended. 
         * B = Either the numerator or the denominator in the fraction 1/2 should be cast as a double. 
         * C = The expression fact1 * fact2 should be cast as double. 
         * D = The expressions 1/2 and 3*4 should both be cast as double.
         * E = The variables fact1 and fact2 should both be declared as int. 
         */
        double fact1 = 1/2; 
        double fact2 = 3 * 4; 
        double product = fact1 * fact2; 
        System.out.println(product); 
        System.out.println("fact 1" + fact1 + "fact 2" + fact2); 
        //A is true because the division will be an int so the answer will get cast as 0 --> 0.0 instead of 0.5
    }
}
