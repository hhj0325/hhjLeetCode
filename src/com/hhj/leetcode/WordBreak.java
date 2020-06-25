package com.hhj.leetcode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/word-break/
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i:" + i + ",j:" + j + "," + s.substring(j, i));
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    System.out.println("dp[" + i + "]" + dp[i] + ",d[" + j + "]" + dp[j]);

                    break;
                }
                System.out.println("dp[" + i + "]" + dp[i] + ",d[" + j + "]" + dp[j]);

            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcodeleetaaaaa";
        List<String> wordict = new ArrayList<>();
        wordict.add("leet");
        wordict.add("code");
        wordict.add("a");
        wordict.add("aa");
        System.out.println(WordBreak.wordBreak(s, wordict));

    }
}
