import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int vertical = x <= w-x ? x : w-x;
        int horizontal = y <= h-y ? y : h-y;

        if(vertical<horizontal){
            System.out.println(vertical);
        }else {
            System.out.println(horizontal);
        }

    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}