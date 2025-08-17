package org.leetcode.min_stack_155;

import java.util.Stack;

public class MinStackDSA {

    public static void main(String[] args) {

    }

    static class MinStack {

        public Stack<Integer> stack;

        public MinStack() {
            this.stack = new Stack<>();
        }

        public void push(int val) {
            this.stack.push(val);
        }

        public void pop() {
            this.stack.pop();
        }

        public int top() {
            return this.stack.peek();
        }

        public int getMin() {
            int temp = Integer.MAX_VALUE;
            for (int val : this.stack) {
                if (temp > val) {
                    temp = val;
                }
            }
            return temp;
        }
    }

/**
 * Your MinStackDSA object will be instantiated and called as such:
 * MinStackDSA obj = new MinStackDSA();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

}
