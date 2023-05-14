package programmers.step_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ReportResult92334 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int[] solution(String[] id_list, String[] report, int k) {
                //정답 : 처리결과 메일 받을 횟수 배열
                int[] answer = new int[id_list.length];
                // idList : 이용자 id 배열
                // report : 각 유저에게 신고된 id 배열
                // k : 정지 기준

                //신고 당한 횟수 >= k 이면 신고자에게 +1해줘야 함

                Arrays.sort(report);
                ArrayList<String> Rarr = new ArrayList<>(Arrays.asList(report));

                //answer 길이만큼 돌리기
                for(int i = 0; i < answer.length; i++){
                    //1.용의자 몇번 신고 당했나 체크
                    String suspect = id_list[i];
                    HashMap<String, String> map = new HashMap<>();

                    String before = "";
                    //2.신고건 map에 담아 제보자 같은 건수는 제외처리
                    for(int j = 0; j < Rarr.size() ; j++){
                        if(before.equals(Rarr.get(j))){continue;}
                        before = Rarr.get(j);
                        String[] content = Rarr.get(j).split(" ");
                        if(content[1].equals(suspect)){
                            map.put(content[0], content[1]);
                            Rarr.remove(j);
                            j--;
                            if(id_list.length == map.size()){ break; }
                        }
                    }
                    //3.신고한 사람들 +1 처리 해주기
                    if(map.size() >= k){
                        for(int m = 0; m < answer.length; m++){
                            if(map.get(id_list[m]) != null && i != m){  // 신고자와 용의자 같을 수 없으니 자기 자신은 제외해줌
                                answer[m] += 1;
                            }
                        }
                    }
                }
                return answer;
            }
        }
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] result = Solution.solution(id_list, report, k);
        System.out.println("결과 :" + result);
    }
}
