import javax.swing.text.Style;
import java.util.Scanner;

class Rect {
    private int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.height * this.width;
    }
}

    public class RectArray {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            Rect rectArray[] = new Rect[4];

            for (int i=0; i<4; i++) {
                System.out.println("--" + (i+1) +"번째 사각형" + "--");
                System.out.print("너비를 입력해 주세요 ");
                int width = sc.nextInt();
                System.out.print("높이를 입력해 주세요 ");
                int height = sc.nextInt();

                rectArray[i] = new Rect(width,height);
            }

            for (int i=0; i<rectArray.length; i++) {
                System.out.println(rectArray[i].getArea());
            }




        }
    }

