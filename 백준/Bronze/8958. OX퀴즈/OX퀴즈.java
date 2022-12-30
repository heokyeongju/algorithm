import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] result = new int[n]; // 라인 별 점수 배열

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        for(int i=0; i<n; i++){
            int cor = 0;
            result[i] = 0;
            
            for(int j=0; j<arr[i].length(); j++ ){
                if(arr[i].charAt(j) == 'O'){
                    cor++;
                    result[i] += cor;
                }
                else{
                    cor = 0;
                }
            }
        }
        for(int re: result){
            System.out.println(re);
        }
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}
