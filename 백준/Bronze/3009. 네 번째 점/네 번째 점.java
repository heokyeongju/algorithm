import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1, y1;
        int x2, y2;
        int x3, y3;
        int x, y;

        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());


        // x좌표
        if(x1 == x2){
            x = x3;
        }
        else if(x1 == x3){
            x = x2;
        }
        else {
            x = x1;
        }
        // y좌표
        if(y1 == y2){
            y = y3;
        }
        else if(y1 == y3){
            y = y2;
        }
        else {
            y = y1;
        }

        System.out.println(x+" "+y);
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}