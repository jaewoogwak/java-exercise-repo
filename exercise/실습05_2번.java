import java.util.Scanner;

public class StringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();

            if (str.equals("exit")) {
                System.out.println("종료합니다..");
                return;
            }
            String tokens[] = str.split(" ");
            System.out.println("어절 개수는 " + tokens.length);
        }
    }
}
