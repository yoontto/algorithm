package programmers.step_2;

import java.io.IOException;
import java.util.*;

public class FixBracket60058 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static String solution(String p) {
                String answer = "";

                while (answer.length() != p.length()) {
                    answer += separateP(p.substring(answer.length()));
                }

                return answer;
            }

            private static String separateP(String p){
                // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. (0)
                 if(p == "") return "";

                //2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리
                //괄호 String 배열로 생성
                String[] w = p.split("");
                String u = "";
                String v = "";

                // 각 괄호가 몇개 들어갔는지 체크하기 위한 변수
                int right = 0;
                int left = 0;

                //균형잡힌 문자열로 나누기
                for(int i = 0; i < w.length; i++){
                    if(w[i].equals("(")) {
                        left += 1;
                    } else {
                        right += 1;
                    }
                    u += w[i];
                    v = p.substring(i+1);

                    if(u.length() % 2 == 0 && left == right){
                        if(isRightPair(u) == false) {
                            return reposition(separateP(v));
                        } else {
                            return u;
                        }
                    }
               }
                return "";
            }

            private static Boolean isRightPair(String u){
                int left=0;
                int right=0;
                for(int i=0; i<u.length(); i++) {
                    if(u.charAt(i)=='(') left++;
                    else if(u.charAt(i)==')') right++;
                    if(left<right) return false;
                }
                return true;
            }

            private static String reposition(String v){
                return "(" + v + ")";
            }

        }

        String ex = ")(";
        String result = Solution.solution(ex);
        System.out.println(result);
    }
}
