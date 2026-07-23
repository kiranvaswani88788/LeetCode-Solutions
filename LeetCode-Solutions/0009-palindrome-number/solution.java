class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int s=0;
        int n=x;
        while(n>0){
            a=n%10;
            s=s*10+a;
            n=n/10;
        }
        if(s==x)
        return true;
        else return false;
        
    }
}
