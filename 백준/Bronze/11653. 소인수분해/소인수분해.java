import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1){
            return;
        }
        while(n != 1){
            for(int i = 2; i <= n; i++){
                // 소수 판별
                if(n % i == 0){
                    System.out.println(i);
                    n = n / i;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}