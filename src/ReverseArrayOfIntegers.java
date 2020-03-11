import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;

public class ReverseArrayOfIntegers {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};

        for(int i=0; i<elements.length/2; i++){

            int storeTemp = elements[i];
            elements[i] = elements[elements.length - i - 1];
            elements[elements.length - i - 1] = storeTemp;
        }

        for (int element :elements) {
            System.out.println(element);
        }

        Stack stacky  = new Stack();

        stacky.push("1");

        stacky.push("2");

        stacky.pop();

        Optional<Integer> s;
    }
}
