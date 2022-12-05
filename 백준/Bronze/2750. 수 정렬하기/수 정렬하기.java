import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine()); // 입력받을 수 개수
        int tmp; // 임시 저장 변수
        int[] array = new int[size]; // 정렬할 수

        // 입력받기
        for(int i=0; i<size; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        // 출력
        for (int i = 0; i<size; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}