public class twoArray {
    public static void main(String[] args) {
        String twoD[][] = new String[4][];
        twoD[0] = new String[1];
        twoD[1] = new String[2];
        twoD[2] = new String[3];
        twoD[3] = new String[4];
        int i, j;

        for(i = 0; i < 4; i++)
            for(j = 0; j < i + 1; j++) {
                twoD[i][j] = "*";

            }
        for(i = 0; i < 4; i++) {
            for(j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
