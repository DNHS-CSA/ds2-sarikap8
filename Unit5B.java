
public class Unit5B
{
    ///////////Q4
    Gadget a = new Gadget();
    //Gadget.setStatus(3);
    Gadget b = new Gadget();
    //A.The code segment does not compile because the setStatus method should be called on an object of the class Gadget, not on the class itself.
    //B.The code segment does not compile because the static variable status is not properly initialized.
    //C.The code segment creates two Gadget objects a and b. The class Gadget’s static variable status is set to 10, then to 3, and then back to 10.
    //D.The code segment creates two Gadget objects a and b. After executing the code segment, the object a has a status value of 3 and the object b has a status value of 3.
    //E.The code segment creates two Gadget objects a and b. After executing the code segment, the object a has a status value of 3 and the object b has a status value of 10.

    //A and B are untrue because the code segment does compile. 
    //C is right because the Gadget class is setting the value of the variable when 
    //the object is initialized the Gadget constructor is run (same for and b)

    //////////////////////////Q6
    UnitsHandler large = new UnitsHandler(100); 
    // UnitsHandler.update(8);
    
    //A. The code segment does not compile, because it is not possible to create the object large from outside the UnitsHandler class.
    //B. The code segment does not compile, because it attempts to change the values of private variables from outside the UnitsHandler class.
    //C. The code segment does not compile, because the update method should be called on the object large instead of on the UnitsHandler class. 
    //D. The code segment creates a UnitsHandler object called large and sets the static variable unitsPerContainer to 100. The static variables containers and totalUnits each retain the default value 0.
    //E. The code segment creates a UnitsHandler object called large and sets the static variables unitsPerContainer, containers, and totalUnits to 100, 8, and 800, respectively.

    //The code segment does compile correctly, so A B and C are wrong. 
    // The creation of the large object sets the unitsPerContainer to 100. 
    //When the update method is run (compiles bc static), containers = 8
    //and totalUnits = 800. Therefore the answer is E. 
    
    /////////Q3
    public class BoolTest
    {
        private int one;
        public BoolTest(int newOne)
        {
            one = newOne;
        }

        public int getOne()
        {
            return one;
        }

        public boolean isGreater(BoolTest other)
        {
            return one > other.one;
        }
        //return one > other.one;
        //return one > other.getOne();
        //return getOne() > other.one;

        //I and II will product the same result because getOne() gives out
        //one by executing it. III is also the same result because the getOne()
        //can be run directly without dot notation, and will give the same output. 

    }
    ////////////////Q5
    public class Beverage

    {

        private int numOunces;

        //private static int numSold = 0;

        public Beverage(int numOz)

        {

            numOunces = numOz;

        }

        public /*static*/ void sell(int n)

        {

            /* implementation not shown */

        }
        //A. Both numOunces and numSold can be accessed and updated.
        //--> The method is static, so the instance variable cannot be accessed. Wrong
        //B. Both numOunces and numSold can be accessed, but only numOunces can be updated.

        //C. Both numOunces and numSold can be accessed, but only numSold can be updated.

        //D. numSold can be accessed but not updated; numOunces cannot be accessed or updated.

        //E. numSold can be accessed and updated; numOunces cannot be accessed or updated.
        // Because numSold is a static variable, the static method can access it. 
        //numOunces is not static, so the static sell method cannot access it.
    }
    //////////////////////////Q8 
    public void testQ8() {
        Student s = new Student("Priya", "Banerjee", -1);
        System.out.println(s);
        //A. The code segment will not compile because an object cannot be passed as a parameter in a call to println.

        //B. The code segment will not compile because firstName, lastName, and age are names of instance variables and cannot be used as parameter names in the constructor.

        //C. The code segment will not compile because the constructor needs to ensure that age is not negative.

        //D. The code segment will compile, but the instance variables will not be initialized correctly because the variable names firstName, lastName, and age refer to the instance variables inside the constructor.

        //E. The code segment will compile, but the instance variables will not be initialized correctly because the variable names firstName, lastName, and age refer to the local variables inside the constructor.
        //A B and C are wrong because the code segment does compile. 
        // the parameter and local variables have the same name, so only
        //the local variables will be referred to, so E is the right answer.
    }
}
