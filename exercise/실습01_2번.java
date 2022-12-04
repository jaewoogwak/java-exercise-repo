import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str[] = sc.nextLine().split(" ");
        int dice[] = new int[3];
        for (int i = 0; i<str.length; i++) {
            dice[i] = Integer.parseInt(str[i]);
        }

        Set<Integer> set = new HashSet<Integer>();

        for (int i=0; i<dice.length; i++) {
            set.add(dice[i]);
        }

        int lengthDiff = dice.length - set.size();
        int prize = 0;
        if (lengthDiff == 0) { // 중복 원소 없음
            int maxNumber = Arrays.stream(dice).max().getAsInt();
            prize = maxNumber * 100;
        } else if (lengthDiff == 1) { // 중복 원소 1개
            prize = dice[1] * 100 + 1000;
        } else {
            prize = dice[0] * 1000 + 10000;
        }

        System.out.println(prize);

    }
}
