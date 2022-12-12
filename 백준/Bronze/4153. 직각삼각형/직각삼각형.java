import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int [] arr = new int[3];

        while(true){
            st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            if(arr[0] == 0){
                return;
            }
            else if(Math.pow(arr[2],2) == Math.pow(arr[1],2)+Math.pow(arr[0],2)){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }

        }
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}