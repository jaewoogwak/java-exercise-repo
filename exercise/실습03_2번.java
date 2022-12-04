import java.util.Arrays;
import java.util.Scanner;

class Player {
    String name;

    public Player(String _name) {
        name = _name;
    }

    String getName() {
        return name;
    }
}

public class GamblingGame {
    public static int[] getRandomNumberList() {
        int randomNumberList[] = new int[3];
        for (int i=0; i<3; i++) {
            randomNumberList[i] = (int)((Math.random() * 10000) % 2);
        }
        return randomNumberList;
    }

    public static boolean isCorrectAnswer(int[] answer, int[] randomNumber) {
        boolean isCorrect = true;
        for (int i=0; i<answer.length; i++) {
            if (answer[i] != randomNumber[i]) isCorrect = false;
        }
        return isCorrect;
    }

    public static void main(String[] args) {
        // 선수 배열 선언
        Player players[] = new Player[2];

        Scanner sc = new Scanner(System.in);

        // 두 선수의 이름을 입력받는다.
        for (int i=0; i<2; i++) {
            System.out.print("선수 이름 입력 >> ");
            // 각 선수 객체 생성
            players[i] = new Player(sc.nextLine());
        }

        int turn = 0; // 0~1
        while(true) {
            int randomNumberList[] = getRandomNumberList();
            // System.out.println(Arrays.toString(randomNumberList));

            System.out.println(players[turn % 2].getName() + " <Enter 외 아무거나 치세요>");
            int answer[] = new int[3];
            String tmp[] = sc.nextLine().split(" ");
            for(int i=0; i<tmp.length; i++) {
                answer[i] = Integer.parseInt(tmp[i]);
            }

            if (isCorrectAnswer(answer, randomNumberList)) {
                System.out.println(players[turn % 2].getName() + "(이)가 승리했습니다.");
                break;
            }

            turn += 1;
        }
    }
}

