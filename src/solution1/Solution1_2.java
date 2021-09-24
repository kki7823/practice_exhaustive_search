package solution1;

import java.util.ArrayList;
import java.util.List;

public class Solution1_2 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int supoza1 = 0;
        int supoza2 = 0;
        int supoza3 = 0;

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == pattern1[i % pattern1.length]) {
                supoza1++;
            }

            if (answers[i] == pattern2[i % pattern2.length]) {
                supoza2++;
            }

            if (answers[i] == pattern3[i % pattern3.length]) {
                supoza3++;
            }
        }

        int[] supoza = {supoza1, supoza2, supoza3};
        int max = findMax(supoza);
        for (int i = 0; i < supoza.length; i++) {
            if (supoza[i] == max) {
                result.add(i + 1);
            }
        }

        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    int findMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
