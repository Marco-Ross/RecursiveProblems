public class TwoDArrays {
    public static void main(String[] args) {

        int[][] twoDee = new int[3][3];

        for(int i = 0; i<twoDee.length; i++){
            for(int j = 0; j<twoDee[i].length; j++){
                if(j == 0 || j == i)
                    twoDee[i][j] = 1;
                else if(i>j)
                    twoDee[i][j] = twoDee[i - 1][j] + twoDee[i -1][j - 1];
            }
        }

        for (int[] ints : twoDee) {
            for (int j = 0; j < twoDee.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
