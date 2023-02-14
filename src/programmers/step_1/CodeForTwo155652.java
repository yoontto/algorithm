package programmers.step_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CodeForTwo155652 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static String solution(String s, String skip, int index) {
                char[] words = s.toCharArray();
                for(int i = 0 ; i < words.length ; i++){
                    for(int j = 0 ; j < index ; j++){
                        do{
                            words[i]++;
                            if(words[i] > 'z'){ //범위 초과시 a로 돌아옴
                                words[i] -= 26; // == 'a'와 동일
                            }
                        }while(skip.contains(String.valueOf(words[i])));
                    }
                }
                String answer = String.valueOf(words);
                return answer;
            }
        }
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String result = Solution.solution(s, skip, index);
        System.out.println("결과 :" + result);
    }
}
