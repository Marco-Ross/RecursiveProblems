public class HighestElementInArray {
    public static void main(String[] args) {
        int[] elements = {2, 5, 3, 9, 7, 10};
        int saveVar = elements[0];

        for(int i=0; i<elements.length; i++){
            if(saveVar < elements[i])
                saveVar = elements[i];
        }
        System.out.println(saveVar);
    }
}
