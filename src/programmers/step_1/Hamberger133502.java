package programmers.step_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Hamberger133502 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public static int solution(int[] ingredient) {
                int answer = 0;

                //1.String으로 바꿔서 포함하면 빼주기
                /*String ingredient_str = Arrays.toString(ingredient).replace(", ","");   //String으로 변경할 때 replace(" ,","") 해줬으면 좀 더 편했을 듯
                StringBuilder sb = new StringBuilder(ingredient_str);
                String goodBurger = "1231";

                //햄버거 만든 자리 -2 해줄 값
                //int resetNum = 0;
                for (int i = 0; i < ingredient.length; i++) {
                    
                    //1) StringBuilder를 사용하면 delete로 replace의 역할을 대신할 수 있음
                    //   sb의 delete의 장점:: replace한 값을 재할당해주지 않아도 됨
                    //   시간초과 : replace는 전체를 치환함, 시간도 오래걸림
                    //   StringBuilder는 순서대로 치환
                    
                    //int place = ingredient_str.indexOf(goodBurger, resetNum);
                    while (sb.indexOf(goodBurger) > -1) {
                        int idx = sb.indexOf(goodBurger);
                        sb.delete(idx, idx + 4);
                        answer++;
                    }
                }*/


                //2. 리스트 or 스택의 size를 활용해 계산하기


                ArrayList<Integer> arr = new ArrayList<>();
                ArrayList<Integer> ex = new ArrayList<>();

                ex.add(1);
                ex.add(2);
                ex.add(3);
                ex.add(1);

                for(int i = 0; i < ingredient.length; i++){
                    arr.add(ingredient[i]);

                    if(arr.size() >= 4){

                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr.get(arr.size()-4));
                        temp.add(arr.get(arr.size()-3));
                        temp.add(arr.get(arr.size()-2));
                        temp.add(arr.get(arr.size()-1));

                        if(temp.equals(ex)){
                            arr.remove(arr.size() -1);
                            arr.remove(arr.size() -1);
                            arr.remove(arr.size() -1);
                            arr.remove(arr.size() -1);
                            answer++;
                        }
                    }
                }

                /*Stack<Integer> stack = new Stack();

                for(int i = 0; i < ingredient.length; i++){
                    stack.push(ingredient[i]);
                    if(stack.size()>=4){
                        if(stack.get(stack.size() - 4) == 1
                        && stack.get(stack.size() - 3) == 2
                        && stack.get(stack.size() - 2) == 3
                        && stack.get(stack.size() - 1) == 1){
                            answer++;
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            stack.pop();
                        }
                    }
                }*/
                return answer;
            }
        }
        int[] ingredient = new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1};
        int result = Solution.solution(ingredient);
        System.out.println(result);
    }
}
