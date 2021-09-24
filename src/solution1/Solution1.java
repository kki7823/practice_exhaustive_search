package solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        int[] supoza = new int[3];

        int count = 0;
        for (int i = 0; i < answers.length; i++) {

            //1번 수포자 supuza[0]
            if (answers[i] == (i % 5 + 1)) {
                supoza[0] += 1;
            }

            //2번 수포자 supuza[1]
            if (i % 2 == 0) {
                if (answers[i] == 2) {
                    supoza[1] += 1;
                }
            } else {
                if (answers[i] == (count % 5) + 1) {
                    supoza[1] += 1;
                }

                if ((count % 5) + 1 == 1) {
                    count += 2;
                } else {
                    count += 1;
                }
            }

            //3번 수포자 supuza[2]
            int[] temp3 = {3, 1, 2, 4, 5};
            if (i % 2 == 0) {
                if (answers[i] == temp3[i / 2 % 5]) {
                    supoza[2] += 1;
                }

                if (i + 1 < answers.length) {
                    if (answers[i + 1] == temp3[i / 2 % 5]) {
                        supoza[2] += 1;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(supoza));

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
