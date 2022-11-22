package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Second_Conditional {
// public class Main {
    public static void main(String[] args) throws IOException {
        //두수 비교하기
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String result = a > b ? ">" : a < b ? "<" : "==";

        System.out.println(result);*/

        //시험성적
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String result = a >= 90 && a <= 100 ? "A"
                    : a >= 80 && a < 90 ? "B"
                    : a >= 70 && a < 80 ? "C"
                    : a >= 60 && a < 70 ? "D"
                    : "F";

        System.out.println(result);*/

        //윤년
        // 윤년 = 4의 배수 && 100의 배수 아닐때 or 400의 배수
        //윤년 == 1, 윤년아님 == 0
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        int result = (y % 4 == 0 && y % 100 > 0) || (y % 400 == 0) ? 1 : 0;

        System.out.println(result);*/

        //사분면
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int result = 0;

        if(x > 0){
            result = y > 0 ? 1 : 4;
        } else {
            result = y > 0 ? 2 : 3;
        }

        System.out.println(result);*/
        

    }
}







