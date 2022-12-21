package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Third_For {
// public class Main {
    public static void main(String[] args) throws IOException {
        //구구단
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }*/


        //A+B -3
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            //br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B);
            sb.append("\n");
        }
        System.out.print(sb);*/


        //합
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int tmp = n - 1;

        while (tmp > 0){
            n += tmp--;
        }
        System.out.println(n);*/
        
        //영수증
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;

        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        String result = total == X ? "Yes" : "No";
        System.out.println(result);*/


        //빠른 A+B
        //처음보는 개념 : BufferedWriter.flush()
        //flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다. (JSP)
        //bw.write(s);//출력
        //bw.newLine(); //줄바꿈
        //bw.flush();//남아있는 데이터를 모두 출력시킴
        //bw.close();//스트림을 닫음
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A+B+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        */


        //A+B - 7
        //sb.append할 때 a+b로 입력하면 문자 그대로 입력됨
        //2+3 -> 23
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int Sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            sb.append("Case #" + i + ": " + Sum + "\n");
        }

        System.out.println(sb);*/


        //A+B - 8
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int Sum = A+B;
            sb.append("Case #"+ i + ": " + A + " + " + B + " = " + Sum +"\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();*/


        //별 찍기 - 1
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/



        //별 찍기 - 2
        //언제 해도 생각하는게 겁나 빡세네,,
        //숫자를 써가면서 천천히 생각해보는 연습 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        //if -> T : 5
        //empty : 4 3 2 1 0 :: int k = T -1; k >= 0; k--;
        //star  : 1 2 3 4 5 :: int i = 1; i <= T; i++;

        for(int k = 0; k < T; k++) {
            for (int i = T; i > 0; i--) { //k = 0, < i= 3
                if(i - 1 > k){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }




    }
}







