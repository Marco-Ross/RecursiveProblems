import java.util.HashSet;
import java.util.Set;

public class RecursionProblems {
    public static void main(String[] args) {
        RecursionProblems recursionProblems = new RecursionProblems();

        //ONE
        //System.out.println(recursionProblems.factorial(5));

        //TWO
        //System.out.println(recursionProblems.bunnyEars(5));

        //THREE
        System.out.println(recursionProblems.sevens(717));
    }

    //ONE
    private int factorial(int n) {
        if(n==1)
            return 1;

        return factorial(n -1) * n;
    }




//    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
//    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
//    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
//
//    bunnyEars2(0) → 0
//    bunnyEars2(1) → 2
//    bunnyEars2(2) → 5

    //TWO
    private int bunnyEars(int numberOfBunnies){

        if(numberOfBunnies == 0)
            return 0;

        if(numberOfBunnies %2 == 0)
            return bunnyEars(numberOfBunnies - 1) + 3;

        return bunnyEars(numberOfBunnies - 1) + 2;
    }



//    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
//    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//
//
//    count7(717) → 2
//    count7(7) → 1
//    count7(123) → 0

    //THREE
    private int sevens(int numberOfSevens){

        if(numberOfSevens == 0)
            return 0;

        if(numberOfSevens %10 == 7)
            return sevens(numberOfSevens%10);

        return sevens(numberOfSevens/10);

    }



//    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
//
//
//  countX("xxhixx") → 4
//  countX("xhixhix") → 3
//  countX("hi") → 0



//    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
//
//
//    changePi("xpix") → "x3.14x"
//    changePi("pipi") → "3.143.14"
//    changePi("pip") → "3.14p"




//    Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
//
//
//    array11([1, 2, 11], 0) → 1
//    array11([11, 11], 0) → 2
//    array11([1, 2, 3, 4], 0) → 0


}