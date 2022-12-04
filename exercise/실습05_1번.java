public class MyPoint {
    int x;
    int y;

    public MyPoint(int _x, int _y) {
        x = _x;
        y = _y;
    }

    @Override
    public String toString() {
        return "MyPoint(" + x +","+ + y + ")";
    }

    public static void main(String[] args) {
        MyPoint a = new MyPoint(2,10);
        System.out.println(a);
    }
}
