
/**
 * Write a description of class Unit3MCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit3MCQ
{
    public static void main(String[] args) {
        int temp; 
        //I. temp = 30;
        //II. temp = 51;
        //III. temp = 60;
        //temp = 30;
        //temp = 51;
        temp = 60;
        String weather;
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "moderate";
        }
        else
        {
            weather = "warm";
        }
        System.out.print(weather);
        //30 prints out warm, does not work as intended. 
        //51 prints moderate, works as intended.
        //60 prints moderate, works as intended. 

        //A: I only <-- ANSWER
        //B: II only
        //C: I and II only
        //D: II and III only
        //E: I, II, and III

        //This is because the cold in 30 gets overridden by the second else statement, changin it to warm. Because the weather variable is the same. 
        ///////////////////////////////////////3.7 comparing objects//////////////////////////
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        else if (first.equals(second))
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
        //when you run the program, C is printed. 
        //A compares the references of the String objects, and not the actual content. The .equals() in part C 
        //compares the actual content of the String obejcst, so C is printed. 
        ////////////////////////////////////////3.4 else if statements//////////////////////////////////////////
        //I.

        int result = 0;
        int x = 1; //for testing purposes
        int y = 1; //for testing purposes
        if (x > y)
        {
            result = x - y;
            System.out.print(result);
        }
        else if (x < y)
        {
            result = y - x;
            System.out.print(result);
        }
        else
        {
            System.out.print(result);
        }
        //II.

        if (x < y)
        {
            System.out.print(y - x);
        }
        else
        {
            System.out.print(x - y);
        }
        //A. Code segment I and code segment II produce the same output for all values of x and y. <--ANSWER
        //B. Code segment I and code segment II produce the same output only when x is equal to y.
        //C. Code segment I and code segment II produce the same output only when x is not equal to y.
        //D. Code segment I and code segment II produce the same output only when x is less than y.
        //E. Code segment I and code segment II do not produce the same output for any values of x and y.
        //By testing when x = y, x < y, and x > y, both numbers printed are the same, proving A is right. 
        // The else in II applies to when x = y and when x > y.
        ///////////////////////////////////////////////3.6/////////////////////////////////////////////////////
        int j = 1; int k = 2; int m = 3; //for testing purposes
        System.out.println(!((j == k) && (k > m))); //original
        System.out.println((j != k) || (k < m)); //A
        System.out.println((j != k) || (k <= m));//B <-- ANSWER
        System.out.println((j == k) || (k < m)); //C
        System.out.println((j != k) && (k <= m)); //D
        System.out.println((j == k) && (k < m)); //E
        
        //e yields false, so it's not e. By Demorgan's law !(A && B) equals !A || !B so B is correct.
    }
}
