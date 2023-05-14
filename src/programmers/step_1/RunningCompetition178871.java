package programmers.step_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class RunningCompetition178871 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static String[] solution(String[] players, String[] callings) {
//                for(String c: callings){
//                    for(int i = 1; i <= callings.length; i++){
//                        if(players[i].equals(c)){
//                            String temp = players[i];
//                            players[i] = players[i-1];
//                            players[i-1] = temp;
//                            break;
//                        }
//                    }
//                }

                String[] result = new String[players.length];
                HashMap<String, Integer> map = new HashMap<>(); //문자, 숫자
                HashMap<Integer, String> map2 = new HashMap<>();//숫자, 문자

                for(int i = 0; i < players.length; i++){
                    map.put(players[i], i);
                    map2.put(i, players[i]);
                }

                for(int i = 0; i < callings.length; i++){
                    //불린 선수
                    String p = callings[i];

                    //선수 기존 등수
                    int n = map.get(p);

                    //따라잡힐 선수
                    String l = map2.get(n-1);

                    //불린선수 -1 해주기
                    map.put(p, n-1);
                    map2.put(n-1, p);

                    //따라잡힌 선수 +1
                    map.put(l, n);
                    map2.put(n, l);
                }

                for(String p : players){
                    result[map.get(p)] = p;
                }

                return result;
            }
        }

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = Solution.solution(players, callings);

        for(String r : result){
            System.out.println(r);
        }
    }
}
