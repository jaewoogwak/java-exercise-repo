import java.io.*;
import java.util.*;

public class FileReaderEx {

    public static int solution(int []arr, int i, int j, int m) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int idx=i-1; idx <=j-1; idx++) {
            list.add(arr[idx]);
        }

        Collections.sort(list);

        return list.get(m-1);
    }

    public static void main(String[] args) {
       int []arr1 = {1,5,2,6,3,7,4};

        System.out.println(solution(arr1, 2,5,3));
    }
}
