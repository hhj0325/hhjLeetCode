package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int count = 0;
        int maxCount = 0;
        char a = '(';
        char b = ')';
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

            }

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
        LongestValidParentheses obj = new LongestValidParentheses();
        System.out.println(obj.longestValidParentheses(s1));
        System.out.println(obj.longestValidParentheses(s2));

    }
}
