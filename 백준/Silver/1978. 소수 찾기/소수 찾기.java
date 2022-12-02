import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++){
            int s = Integer.parseInt(st.nextToken());
            int a = 0;
            for(int j = 1; j<=s; j++){
                if(s%j == 0){
                    a++;
                }
            }
            if(a == 2){
                result++;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}