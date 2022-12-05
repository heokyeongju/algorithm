import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 응시자 수
        int k = Integer.parseInt(st.nextToken()); // 수상자 수
        int[] array = new int[n]; // 성적 배열
        int tmp; // 임시 저장

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 내림차순 정렬
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]<array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(array[k-1]);
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}