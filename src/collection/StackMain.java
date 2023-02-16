package src.collection;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        String[] groupA = { "우즈베키스탄", "쿠웨이트", "사우디", "대한민국" };

        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < groupA.length; i++) {
            stack.push(groupA[i]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
