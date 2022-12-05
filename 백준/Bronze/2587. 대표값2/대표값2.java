import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5]; // 5개 수 저장 배열
        int av = 0; // 평균
        int mid; // 중앙값
        int tmp; // 임시 저장

        for(int i=0; i<5; i++){
            array[i] = Integer.parseInt(br.readLine());
            av += array[i];
        }

        av = av/5;

        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                if(array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        mid = array[2];
        System.out.println(av); // 평균 출력
        System.out.println(mid); // 중앙값 출₩
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}