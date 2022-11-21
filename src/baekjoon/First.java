package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class First {

    public static void main(String[] args) throws IOException {
        //입출력과 사칙연산
        //System.out.println("Hello World");

        //A+B(1)
        /*Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
        */

        //A+B(2)
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a+b);

        System.out.println(sb);*/

        //A-B
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a-b);

        System.out.println(sb);*/

        //A*B
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a*b);
        System.out.println(sb);*/

        //A/B
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        sb.append(a/b);

        System.out.println(sb);*/

        //사칙연산
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        *//*StringBuilder sb = new StringBuilder();*//*

        st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //76ms, 11544KB
        *//*sb.append(a+b);
        sb.append('\n');
        sb.append(a-b);
        sb.append('\n');
        sb.append(a*b);
        sb.append('\n');
        sb.append(a/b);
        sb.append('\n');
        sb.append(a%b);*//*

        //76ms, 11552KB
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
*/

        //??! (단순 출력 문제)
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String id = br.readLine();
        System.out.println(id+"??!");*/

        //1998년생인 내가 태국에서는 2541년생?!
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        System.out.println(year - 543);*/

        //킹, 퀸, 룩, 비숍, 나이트, 폰
        /*int[] origin = {1,1,2,2,2,8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int i = 0;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());

            sb.append(origin[i]-a);
            sb.append(" ");

            i++;
        }
        System.out.println(sb);*/

        //나머지연산- 모듈러 연산이라고 함
        /*BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println((a+b)%c);
        System.out.println(((a+b)%c)%c);
        System.out.println(((a*b)%c)%c);
        System.out.println(((a*b)%c)%c);*/

        //곱셈
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        String[] arr = b.split("");

        int b1 = Integer.parseInt(arr[0]);
        int b2 = Integer.parseInt(arr[1]);
        int b3 = Integer.parseInt(arr[2]);

        int third = b3 * a;
        int fourth = b2 * a;
        int fifth = b1 * a;

        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(third+(fourth*10)+(fifth*100));*/

        //고양이
        /*System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");*/

        //개
        /*System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");*/

        //새싹
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");


    }
}
