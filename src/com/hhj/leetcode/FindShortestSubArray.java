package com.hhj.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Node> calMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if (calMap.get(num) == null) {
                Node tmp = new Node(1, i, i);
                calMap.put(num, tmp);
            } else {
                Node tmp = calMap.get(num);
                tmp.add();
                tmp.setEnd(i);
            }
        }

        int degree = 0;
        int len = 0;
        for (Node ret : calMap.values()) {
            if (ret.count > degree) {
                len = ret.getEnd() - ret.getStart() + 1;
                degree = ret.count;
            } else if (ret.count == degree) {
                len = Math.min(len, ret.getEnd() - ret.getStart() + 1);

            }
        }
        return len;
    }

    public static void main(String[] args) {
        FindShortestSubArray tmp = new FindShortestSubArray();
        System.out.println(tmp.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        System.out.println(tmp.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    class Node {
        private Integer count;
        private Integer start;
        private Integer end;

        public Node() {

        }

        public Node(Integer count, Integer start, Integer end) {
            this.count = count;
            this.start = start;
            this.end = end;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getStart() {
            return start;
        }

        public void setStart(Integer start) {
            this.start = start;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }

        public void add() {
            this.count += 1;

        }
    }
}
