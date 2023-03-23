package programmers.step_1;

import java.io.IOException;
import java.util.Arrays;

public class Babbling133499 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int solution(String[] babbling) {
                //1.  babbling에 for문을 돌려 각각의 값이 can의 단어를 포함하면 삭제한다.
                //2. 글자가 남아있지 않으면 result++;

                String[] can = {"aya", "ye", "woo", "ma"};
                int result = 0;

                for(String bab : babbling){
                    for (String c : can){
                        if(bab.contains(c+c)) break;

                        if(bab.contains(c)){
                            bab = bab.replace(c," ");
                        }
                    }

                    bab = bab.replace(" ", "");
                    if(bab.length() == 0) result ++;
                }

                return result;
            }
        }
        String[] babbling = {"wooyemawooyeye", "yeaya", "mayaa", "ymaeaya"};

        int result = Solution.solution(babbling);
        System.out.println(result);
    }
}
