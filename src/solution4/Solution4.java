package solution4;

public class Solution4 {
    public int tribonacci(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        int result = 0;
        for (int i = n - 3; i < n; i++) {
            result += tribonacci(i);
        }
        return result;
    }
}
