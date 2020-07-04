package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int count = 0;
        int maxCount = 0;
        char cur = s.charAt(0);
        char tail;

        for (int i = 1 ; i < s.length(); i++){
            tail = s.charAt(i);
            if(addCheck(cur, tail)){
                count +=2;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else if (passCheck(cur, tail)){
            }
            else {
                count = 0;
            }
            cur = tail;

        }
        return maxCount;

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
        String s3 = "())";

        LongestValidParentheses obj = new LongestValidParentheses();
        System.out.println(obj.longestValidParentheses(s1));
        System.out.println(obj.longestValidParentheses(s2));
        System.out.println(obj.longestValidParentheses(s3));

    }
}
