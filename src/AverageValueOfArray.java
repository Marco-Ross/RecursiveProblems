public class AverageValueOfArray {
    public static void main(String[] args) {
        int[] elements = {2, 5, 3, 9, 7, 10};
        int sum=0;

        for(int i=0; i<elements.length; i++){
            sum = sum + elements[i];

        }

        System.out.println("Average is: " + sum / elements.length);
    }
}
