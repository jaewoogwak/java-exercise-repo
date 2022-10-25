import java.util.*; //import

public class p2 {
    public static int checkr(List<Integer> q1, List<Integer> q2) {
        int sum1=q1.stream().mapToInt(Integer::intValue).sum();
        int sum2=q2.stream().mapToInt(Integer::intValue).sum();
        if((sum1 + sum2) % 2 != 0) return -1;

        int count = 0;
        int length = q1.size() * q2.size() * q1.size() * q2.size();
        while(count < length) {
            sum1=q1.stream().mapToInt(Integer::intValue).sum();
            sum2=q2.stream().mapToInt(Integer::intValue).sum();
            if(sum1 == sum2) return count;

            // head의 값 조회
            int head_q1 = q1.get(0);
            int head_q2 = q2.get(0);

            // q1 합이 q2보다 크면, q1에서 하나 빼서 q2로 보냄
            if(sum1 > sum2) {
                int tmp = q1.remove(0);
                q2.add(tmp);
            } else if(sum1 < sum2) {
                int tmp = q2.remove(0);
                q1.add(tmp);
            }
            count +=1;
        }
        return  -1;
    }
    public static void main(String[] args) {
        List<Integer> q1 = new ArrayList<>(Arrays.asList(3,2,7,2));
        List<Integer> q2 = new ArrayList<>(Arrays.asList(4,6,5,1));
        System.out.println(checkr(q1, q2));

    }
}
