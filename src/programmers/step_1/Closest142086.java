package programmers.step_1;

import java.io.IOException;
import java.util.Arrays;

public class Closest142086 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int[] solution(String s) {
                //배열은 항상 길이를 지정해줘야 함
                int answer[] = {};

                //방법 1 : 좀 더 느림

                //최대시간 :: 테스트 7 〉	통과 (35.69ms, 106MB)
                //subString & split & Arrays.fill & lastIndexOf
                String[] sArr2 = s.split("");

                //배열은 항상 길이를 지정해줘야 함
                answer = new int[sArr2.length];

                //Arrays.fill 이 for문보다 빠름
                Arrays.fill(answer, -1);
                //for(int i = 0; i < sArr2.length; i++){
                //    answer[i] = -1;
                //}

                for(int i = 1; i < sArr2.length; i++){
                    //대상문자들
                    String ex = s.substring(0, i);

                    //lastIndexOf가 contains 보다 빠름
                    //public boolean contains(CharSequence var1) {
                    //        return this.indexOf(var1.toString()) > -1;
                    //}
                    //contains는 indexOf를 예쁘게 포장한 바구니 역할!

                    //if(ex.contains(sArr2[i])){
                    if(ex.lastIndexOf(sArr2[i]) > -1){ //5 〉통과 (28.32ms, 99.5MB)
                        int idx = i - ex.lastIndexOf(sArr2[i]);
                        answer[i] = idx;
                    }
                }


                //  방법 2 : 좀 더 빠름 (split 안씀)
                /*answer = new int[s.length()];
                Arrays.fill(answer, -1);

                for(int i = 1; i < s.length(); i++){
                    //대상문자들
                    String ex = s.substring(0, i);
                    if(ex.contains(s.substring(i, i+1))){
                        int idx = i - ex.lastIndexOf(s.substring(i, i+1));
                        answer[i] = idx;
                    }
                }*/
                return answer;
            }
        }

        int[] result = Solution.solution("babo");
        System.out.println(result);
    }
}
