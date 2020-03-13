
public class Unit4MCQ
{
    public static String mystery(String word, int num)
    {
        String result = "";
        for (int k = num; k >= 0; k--)
        {
            result += word.substring(0, k);
        }
        return result;
    }
    //A. ccocom
    //B. comcoc
    //C. ccocomcomp
    //D. compcomcoc
    //E. comcomcomcom

    public static void main(String[] args) {
        //mystery("computer", 3); tested this
        int total = 0;
        //original code
        for (int k = 0; k <= 100; k += 2)
        {
            total += k;
        }
        System.out.println("og: " + total); 
        total = 0;
        //A 
        for (int k = 0; k < 100; k += 2)
        {
            total += k + 1;
        }
        System.out.println("A: " + total); 
        total = 0;
        //B 
        for (int k = 1; k < 101; k += 2)
        {
            total += k - 1;
        }
        System.out.println("B: " + total); 
        total = 0;
        //C
        for (int k = 0; k <= 101; k += 2)
        {
            total += k + 1;
        }
        System.out.println("C: " + total); 
        total = 0;
        //D 
        for (int k = 1; k <= 101; k += 2)
        {
            total += k + 1;
        }
        System.out.println("D: " + total); 
        total = 0;
        //E 
        for (int k = 1; k <= 101; k += 2)
        {
            total += k - 1;
        }
        System.out.println("E: " + total); 

        //option E matches the original total when the code is run. The original code is summing all even 
        //integers between 0 and 100, the code in option E performs the addition for all odd integers between 
        //1 and 101, but 1 is subtracted before adding to total, so the same numbers are added to the 
        //iteration each time. 
    }
}
