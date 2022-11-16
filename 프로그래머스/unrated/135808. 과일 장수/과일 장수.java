import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int size = score.length;
        int[] val = new int[k];
        // 등급별 사과 개수
        for(int i=0; i<size; i++){
            for(int j=0; j<k; j++){
                if(score[i]==j+1){
                    val[j]++;
                    break;
                }
            }
        }
        // 이익 계산
        for(int i=1; i<k; i++){
            answer += val[k-i]/m*(k-i+1)*m;
            val[k-i-1] += val[k-i]%m;
        }
        answer += val[0]/m*m;
        
        return answer;
    }
}