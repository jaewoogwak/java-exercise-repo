import java.util.*;

public class Main {

    public static int[][] Make2DArray(int num) {

        int [][] arr2D = new int[num][num];

        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                arr2D[i][j] = 0;
            }
        }

        return arr2D;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] newArray2D = Make2DArray(num);

        for (int i =0; i<newArray2D.length; i++) {
            System.out.println(Arrays.toString(newArray2D[i]));
        }
    }
}
