import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] result = new int[26]; // 결과 배열 = 알파벳 개수만큼의 크기

        for(int i = 0; i < 26 ; i++){
            result[i] = -1;
        }

        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(result[index] == -1){
                result[index] = i;
            }
        }
        for(int i = 0; i < 26; i++ ){
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}
