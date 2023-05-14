package programmers.step_1;

import java.io.IOException;

public class FoodFight134240 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static String solution(int[] food) {
                //food : 칼로리가 낮은 순서대로 배열된 음식들
                //food[0] : 물의 양, 항상 1

                // for문 : 각 음식 수를 나누는 for문 -> 몪을 저장하는 배열 생성
                // for문 : 몫 배열로 반복문을 만든다. 몫만큼 자리값을 반복해서 answer에 붙여주고
                // 배열이 끝나면 0을 붙여준다.
                // for문 : 몫 배열의 역순 반복문을 실행해 answer에 붙여줘서 완성

                String answer = "";
                int[] quotient = new int[food.length];
                quotient[0] = 0;

                //{0, 1, 2, 3}
                for(int i = 1; i < food.length; i++) {
                    quotient[i] = food[i] / 2;
                }

                for(int i = 1; i < quotient.length; i++){
                    for(int k = 0; k < quotient[i]; k++){
                        answer += i;
                    }
                }

                answer += 0;

                for(int i = quotient.length - 1; i > 0; i--){
                    for(int k = 0; k < quotient[i]; k++){
                        answer += i;
                    }
                }

                return answer;
            }
        }
        int[] foodArr = new int[4];
        foodArr[0] = 1;
        foodArr[1] = 7;
        foodArr[2] = 1;
        foodArr[3] = 2;
        String result = Solution.solution(foodArr);
        System.out.println(result);
    }
}
