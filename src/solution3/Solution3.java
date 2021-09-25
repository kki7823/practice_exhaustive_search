package solution3;

public class Solution3 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int width = 0;
        int height = 0;

        for (int x = 3; x <= (brown + yellow) / 3; x++) {
            if ((brown + yellow) % x != 0) continue;

            int y = (brown + yellow) / x;
            if ((x * 2) + (y * 2) - 4 == brown) {
                width = Math.max(x,y);
                height = Math.min(x,y);
                break;
            }
        }


        int[] result = {width, height};
        answer = result;
        return answer;
    }
}
