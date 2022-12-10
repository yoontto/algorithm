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

        //알람시계
        //알람 45분 앞당기기
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int outM = m + 15;
        if(outM >= 60){
            m = outM - 60;
        } else {
            m = outM;
            h -= 1;
        }

        if(h < 0){
            h += 24;
        }
        System.out.print(h + " " +m);*/

        //오븐 시계
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cookTime = Integer.parseInt(br.readLine());

        int min = m+cookTime;

        if(min >= 60){
            m = min % 60;
            h += min / 60;
        } else {
            m += cookTime;
        }

        if(h >= 24){
            h -=24;
        }

        System.out.print(h+" "+m);*/

        //주사위 세개 
        //와 이거 진짜 어렵다... 조건문에 왤케 약하지
        // 최대값 구하기는 Math.max로도 할 수 있음
        // Math.max(a, Math.max(b,c));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int prize = 0;

        if(a == b && b == c){
            prize = 10000 + a * 1000;
        } else {
            if(a != b && a != c && b != c){ // 세 수가 모두 다른 경우
                int max;
                if(a > b){
                    if(c > a){ //c>a>b
                        max = c;
                    } else { // a>b,c
                        max = a;
                    }
                } else { //b > a
                    if(c > b){ //
                        max = c;
                    } else { // b>a, c<b
                        max = b;
                    }
                }
                prize = max * 100;
            } else {
                if(a == c || a == b){ //363
                    prize = 1000 + a * 100;
                } else { //633
                    prize = 1000 + b * 100;
                }
            }

        }
        System.out.print(prize);
    }
}







