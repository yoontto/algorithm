package programmers.step_1;

import java.io.IOException;
import java.util.ArrayList;

public class Flip12932 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int[] solution(long n) {
                String[] temp = String.valueOf(n).split("");

                int[] answer = new int[temp.length];
                int j = 0;

                for(int i = temp.length - 1; i >= 0; i--){
                    answer[i] = Integer.parseInt(temp[j]);
                    j++;
                }
                return answer;
            }
        }
        int[] result = Solution.solution(12345);
        System.out.println(result);
    }
}
