package solution1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1};

//        Solution1 sol = new Solution1();
//        Solution1_1 sol = new Solution1_1();
        Solution1_2 sol = new Solution1_2();
        int[] answer = sol.solution(answers);

        System.out.println("answer : "+Arrays.toString(answer));

    }
}
