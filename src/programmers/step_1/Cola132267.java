package programmers.step_1;

import java.io.IOException;

public class Cola132267 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int solution(int a, int b, int n) {
                int answer = 0;

                //마트에 줘야하는 병 수 a 3
                //마트가 (a한 묶음당) 주는 병 수 b 2
                //가지고 있는 빈 병 수 n 20
                //처음에 틀린 이유 : 예제에서 b가 1이라서 거의 무시하고 코드를 썼다.
                //b!=1 인 경우도 생각했어야 했다!

                // n / a = tmp
                // tmp * b  + answer
                // n % a = 나머지
                // 나머지 + tmp

                while(n / a > 0){
                    int back = (n / a) * b;
                    n = back + (n % a);

                    answer += back;
                }
                return answer;
            }
        }

        int result = Solution.solution(4, 1, 20);
        System.out.println(result);
    }
}
