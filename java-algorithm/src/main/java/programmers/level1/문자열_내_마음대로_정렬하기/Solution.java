package programmers.level1.문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                } else {
                    return -1;
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        Solution solution = new Solution();
        solution.solution(strings, 1);
    }
}