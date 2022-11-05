class Solution {
    public String solution(int[] food) {
        String answer = "";
        int size = food.length;
        for(int i=1; i<size; i++){
            int j = food[i]/2;
            for( j = j ; j>0; j--){
                answer += i;
            }
        }
        String reverse = new StringBuffer(answer).reverse().toString();
        answer += 0;
        answer += reverse;
        
        return answer;
    }
}