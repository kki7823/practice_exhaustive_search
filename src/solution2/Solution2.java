package solution2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution2 {
    Set<Integer> numSet = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        char[] arr = numbers.toCharArray();
        boolean[] visit = new boolean[arr.length];

        for (int i = 1; i <= arr.length; i++) {
            char[] result = new char[i];
            permutation(visit, i, 0, arr, result);
        }

        Iterator<Integer> iterator = numSet.iterator();
        int count = 0;
        while (iterator.hasNext()){
            int number = iterator.next();
            if(isPrimeNumber(number)){
                count++;
            }
        }
        answer = count;
        return answer;
    }

    public void permutation(boolean[] visit, int r, int idx, char[] arr, char[] result) {
        if (idx == r) {
            int number = Integer.parseInt(String.valueOf(result));
//            System.out.println(number);
            numSet.add(number);

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visit[i]) {
                continue;
            }

            result[idx] = arr[i];
            visit[i] = true;
            permutation(visit, r, idx + 1, arr, result);
            visit[i] = false;
        }

    }

    public boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        if (count == 2)
            return true;
        else
            return false;
    }
}
