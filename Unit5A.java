
/**
 * Write a description of class Unit5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5A
{
    /////////////////////////////Q1///////////////////////////
    //must be accessed from outside... public method 
    //must be B D or E. 
    //int must be defined outside of method, must be B.
    private int numerator;
    private int denominator;
    public double fractionToDecimal()
    {
        return (double) numerator / denominator;
    }
    //testing B, it works.

    ///////////////////////////Q3/////////////////////////////
    public class Employee
    {
        private String name;
        private double salary;
        // constructor and methods not shown
    }
    //name and salary are instance variables (A is wrong)
    //name and salary must be kept to itself by class --> private variables
    //class must be accessed by other classes --> public class
    //therefore, option C is correct. 

    //////////////////////Q14////////////////////////////////////////
    public class Superhero

    {

        private String name;

        private String secretIdentity;

        private int strength;

        public Superhero(String realName, String codeName)

        {

            name = realName;

            secretIdentity = codeName;

            strength = 5;

        }

        public int levelUp(int amount)  // line 14

        {

            strength += amount;          // line 16
            return strength; 
        }
        //A. In line 14, levelUp should be declared as type void.
        //^ ANSWER
        //B. In line 14, amount should be declared as type void.

        //C. Line 16 should be changed to strength + amount;.

        //D. Line 16 should be changed to return strength + amount;.

        //E. Line 16 should be changed to return amount;.
        
        //BlueJ gives an error because there is no return statement that returns an integer
        //because nothing is returned, it must be a void method. 
        
    }
}
