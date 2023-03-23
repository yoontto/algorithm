package programmers.step_1;

import java.io.IOException;
import java.util.Arrays;

public class SmallestRectangle86491 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int solution(int[][] nameCard) {
                //1.  배열의 한 행의 두 값을 비교해 큰 값, 작은 값 나누기
                //1-1. 큰값 -> int big[] / 작은 값 -> int small[]
                //2.  big[] 값 비교 -> 가장 큰 값 max_1 로 저장
                //3.  small[] 값 비교 -> 가장 큰 값 max_2 로 저장
                //4.  두 값 곱해서 결과 출력

                int l = nameCard.length;
                int[] big = new int[l];
                int[] small = new int[l];

                for(int i = 0; i < l; i++){
                    if(nameCard[i][0] < nameCard[i][1]){
                        big[i] = nameCard[i][1];
                        small[i] = nameCard[i][0];
                    } else {
                        big[i] = nameCard[i][0];
                        small[i] = nameCard[i][1];
                    }
                }

                Arrays.sort(big);
                Arrays.sort(small);

                return big[l - 1] * small[l - 1];
            }
        }
        int[][] nameCard = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int result = Solution.solution(nameCard);
        System.out.println(result);
    }
}
