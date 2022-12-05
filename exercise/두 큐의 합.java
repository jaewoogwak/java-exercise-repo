import java.io.*;
import java.util.*;

public class QueueSum {

    public static int sumOfQueue(Queue q) {
        Iterator iter = q.iterator();
        int sum = 0;
        while(iter.hasNext()) {
            sum += (int)iter.next();
        }
        return sum;
    }


    public static int solution(Queue q1, Queue q2) {
        // 두 큐의 합 구하기
        int sum1 = sumOfQueue(q1);
        int sum2 = sumOfQueue(q2);

        int totalSum = sum1 + sum2;

        // 한 쪽 큐가 작으면 다른 큐에서 삭제한 요소를 넣어주기
        int count =0;
        int limit = q1.size() + q2.size();
        while(count < limit) {
            if (sumOfQueue(q1) == sumOfQueue(q2)) {
                return count;
            } else if (sumOfQueue(q1) < sumOfQueue(q2)) { // q1의 합이 q2보다 작다면 q2에서 빼온다
                int el = (int)q2.remove();
                q1.add(el);
            } else {
                int el = (int)q1.remove();
                q2.add(el);
            }
            count += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>(Arrays.asList(3,2,7,2));
        Queue<Integer> q2 = new LinkedList<Integer>(Arrays.asList(4,6,5,1));
        System.out.println(solution(q1, q2));
    }
}
