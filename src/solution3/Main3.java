package solution3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;

        Solution3 sol = new Solution3();
        int[] answer = sol.solution(brown, yellow);
        System.out.println(Arrays.toString(answer));
    }
}
