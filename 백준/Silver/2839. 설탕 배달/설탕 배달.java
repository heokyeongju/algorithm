import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n = Integer.parseInt(br.readLine());
        int a = n/5;
        int b = n/3;

        for(int i = a; i >= 0; i--){
            for(int j = 0; j<=b; j++){
                if(n == i*5 + j*3){
                    result = i+j;
                    break;
                }
            }
            if(result !=0){
                break;
            }
        }
        if(result == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}