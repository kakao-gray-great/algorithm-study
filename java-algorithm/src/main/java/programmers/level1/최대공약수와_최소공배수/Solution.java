package programmers.level1.최대공약수와_최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }

    private int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    private int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
}