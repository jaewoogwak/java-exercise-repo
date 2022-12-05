import java.io.*;
import java.util.*;

public class FileReaderEx {
    public static boolean ParenthesesCheck(String str) {
        char[] tmp = str.toCharArray();
        Stack<Character> stk = new Stack<Character>();

        stk.push(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            if (!stk.isEmpty()) {
                if (stk.peek() == '(') {
                    if (tmp[i] == ')') {
                        stk.pop();
                    } else {
                        stk.push(tmp[i]);
                    }
                }
            } else {
                stk.push(tmp[i]);
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase[] = { "(())", "(()()((()))", "((()))()()(()))", "((((())))(()(()()))((()))()()((()))(((()()))()()))" };


        for (int i=0; i< testCase.length; i++) {
            System.out.println(testCase[i] +"의 결과: "+  ParenthesesCheck(testCase[i]));

        }

    }
}
