package programmers.step_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewId72410 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static String solution(String new_id) {
                String answer = "";

//              1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
                new_id = new_id.toLowerCase();

//              2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
                //ascii코드 이용?? 45 95 46
                //배열?
                char[] idArr = new_id.toCharArray();
                List<Character> newidList = new ArrayList<>();
                for (int i = 0; i < idArr.length; i++) {
                    char a = idArr[i];
                    if(a >=48 && a <= 57){
                        newidList.add(a);
                    } else if(a >= 97 && a <= 122){
                        newidList.add(a);
                    } else if(a == 45 || a == 46 || a == 95){
                        newidList.add(a);
                    }
                }

//              3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
                for (int i = 0; i < newidList.size() - 1; i++) {
                    if (newidList.get(i) == 46 && newidList.get(i + 1) == 46) {
                        newidList.remove(i);
                        i--;
                    }
                }

//              4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
                removePeriodHeadAndTail(newidList);

//              5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
                if (newidList.size() == 0) {
                    newidList.add('a');
                }

//              6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//                   만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
                if (newidList.size() >= 16) {
                    for (int i = newidList.size() - 1; i >= 15; i--) {
                        newidList.remove(i);
                    }
                }
                removePeriodHeadAndTail(newidList);

//              7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
                if(newidList.size() <= 2){
                    char last = newidList.get(newidList.size()-1);
                    for(int i = newidList.size()-1; i < 2; i++){
                        newidList.add(last);
                    }
                }

                for(int i = 0; i < newidList.size(); i++){
                    answer += newidList.get(i);
                }

                return answer;
            }

        }
        String new_id = "123_.def";
        String result = Solution.solution(new_id);
        System.out.println(result);



    }

    private static void removePeriodHeadAndTail(List<Character> l) {
        if (l.get(0) == 46) {
            l.remove(0);
        }
        if(l.size() != 0) {
            if (l.get(l.size() - 1) == 46) {
                l.remove(l.size() - 1);
            }
        }
    }
}
