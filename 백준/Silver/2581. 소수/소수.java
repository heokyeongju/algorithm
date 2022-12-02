import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;

        for(int i = m; i <= n; i++){
            int a = 0; // 약수 개수 저장 변수 - 소수 개수 카운트를 위한
            for(int j = 1; j <= i ; j++){
                if(i % j ==0){
                    a++;
                }
                if(a>2){
                    break;
                }
            }
            if(a==2){
                sum += i;
                if(min == 0){
                    min = i;
                }
            }
        }

        if(min == 0){
            System.out.printf("-1");
        }
        else{
            System.out.printf("%d\n%d",sum,min);
        }
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}