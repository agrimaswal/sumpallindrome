
//gfg problem


//AGRIM ASWAL

class Solution {
    int isDigitSumPalindrome(int N) {
        int num=N;
        int sum=0;
        
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        
        String str=String.valueOf(sum);
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return 0;
            }
            left++;
            right--;

        }
        return 1;
    }
}