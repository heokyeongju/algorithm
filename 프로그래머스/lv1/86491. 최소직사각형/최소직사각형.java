class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int len = sizes.length;
        int l=0, s=0;
        for(int i=0; i<len; i++){
            if(sizes[i][0]>sizes[i][1]){
                if(sizes[i][0]>l){
                    l = sizes[i][0];
                }
                if(sizes[i][1]>s){
                    s = sizes[i][1];
                }
            }
            else{
                if(sizes[i][0]>s){
                    s = sizes[i][0];
                }
                if(sizes[i][1]>l){
                    l = sizes[i][1];
                }
            }
        }
        answer = l*s;
        return answer;
    }
}