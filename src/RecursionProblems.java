import java.util.HashSet;
import java.util.Set;

public class RecursionProblems {
    public static void main(String[] args) {
        RecursionProblems recursionProblems = new RecursionProblems();

        System.out.println(recursionProblems.factorial(5));
    }

    public int factorial(int n) {
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

    

}