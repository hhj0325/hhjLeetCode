package com.hhj.leetcode;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;

    }

    private boolean addCheck(char a, char b) {
        return a == '(' && b == ')' ;
    }

    private boolean passCheck(char a, char b) {
        return a == ')' && b == '(';
    }


    public static void main(String[] args) {
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "())((())";

        LongestValidParentheses obj = new LongestValidParentheses();
        System.out.println(obj.longestValidParentheses(s1));
        System.out.println(obj.longestValidParentheses(s2));
        System.out.println(obj.longestValidParentheses(s3));

    }
}
