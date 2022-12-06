package programmers.step_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


//예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면,
//다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
//이익이 발생하지 않는 경우에는 0을 return 해주세요.
public class FruitSeller135808 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int solution(int k, int m, int[] score) {
                int answer = 0;

                //이 문제의 핵심
                //sort 한 int arr의 뒤에서 m번째 숫자들이 answer에 영향을 준다.
                //고로 'm번째 숫자 k * m'를 해서 answer에 누산하면 되는 것이다.

                //빈 박스
                Stack<Integer> box = new Stack<>();
                
                //arr를 큰 순서대로 줄 세운다.
                Arrays.sort(score);

                //arr를 m의 수만큼 나눠 box를 만든다.
                for(int i = 0; i < score.length; i++){
                    box.push(score[score.length - i-1]);

                    //box가 다 찼을 때, 각 box의 최저 점수와 m을 곱하고
                    if(box.size() == m) {
                        answer += m * box.peek();
                        box.removeAllElements();
                    }
                }


                return answer;
            }
        }
        //사과의 최대 점수
        int k = 4;
        //한 상자에 들어가는 사과의 수
        int m = 3;
        //사과 Arr
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = Solution.solution(k, m, score);
        System.out.println(result);
    }

}
