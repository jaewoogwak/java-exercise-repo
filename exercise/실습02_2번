import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int)((Math.random() * 10000) % 10);
        System.out.println(answer);
        for (int i =0; i<7; i++) {
            int guess = sc.nextInt();
            if (guess == answer) {
                System.out.println("승리");
                break;
            } else if (guess > answer) {
                System.out.println("입력한 숫자가 정답보다 큽니다.");
            } else {
                System.out.println("입력한 숫자가 정답보다 작습니다.");
            }
        }
    }
}
