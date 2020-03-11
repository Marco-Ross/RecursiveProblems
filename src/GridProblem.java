public class GridProblem {
    public static void main(String[] args) {
        String[][] gridArray = new String[10][10];

        for(int i=0; i<gridArray.length; i++){
            for(int j=0; j<gridArray[i].length; j++) {
                System.out.print("- ");
            }
            System.out.println("");
        }
    }
}
