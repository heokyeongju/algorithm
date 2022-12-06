import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 입력받을 수 개수
        List<Integer> array = new ArrayList<>();

        // 입력
        for(int i=0; i<n; i++){
            array.add(Integer.parseInt(br.readLine()));
        }
        // 정렬 함수
        Collections.sort(array);
        // 출력
        for(int value:array){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}