public class Unit2MCQ
{
    //I changed Thing to Unit2MCQ because is it a constructor, and has to match the class name.Initializes to blue.
    private String color; 
    public Unit2MCQ() 
    {
        color = "Blue"; 
    }

    public Unit2MCQ(String setColor) 
    {
        color = setColor; 
    }

    public static void main(String[] args) {
        //Question: Which of the following code segments, when appearing in a class other than Thing would create a 
        //reference of type Thing with a value of null? 
        /* A= Thing someThing = new Thing("Green"); 
         * B= Thing someThing = new Thing(""); 
         * C= Thing someThing = new Thing(); 
         * D= Thing someThing; <-- ANSWER
         * E= Thing("Green"); 
         */

        //the variable is never initialized in D, so the value would be null until assigned, 
        // so the answer is D. 

        ///////////////////////2.9 MCQ Skill 1.B Using the math class//////////////////////
        //The code segment below is intended to randomly print one of the values 2, 4, 6, or 8 with equal probability.

        //int val = /* missing code temp replacement*/
        //val *= 2;
        //System.out.print(val);
        //Which of the following can be used to replace /* missing code */ so that the code segment works as intended?
        //int a = (Math.random() * 4 + 1);
        //int b = (Math.random() * 8); 
        int c = (int) (Math.random() * 4);
        int d = (int) (Math.random() * 4 + 1); 
        int e = (int) (Math.random() * 8 + 1);

        //A and B give lousy conversion errors, so cannot be correct. 
        //Math.random() returns a double between 0 and 1. Multiplying by 4 and adding 1 gives the available set at 1234
        //By multiplying 1234 by 2 you get 2468 as the possible options for answers. 
    }
}
