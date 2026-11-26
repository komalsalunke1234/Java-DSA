class Solution {
    public boolean canAliceWin(int n) {
        int rem=n;
        int a=10;
        int b=9;
        if(n<10) return false;
        int count=0;
        for(int i=0;i<10;i++){
            if(count==0){
            rem=rem-a;
             if(rem<0)return false;
            count++;
            b=a-1;
           
            }
           
else{
    rem=rem-b;
     if(rem<0)return true;
    count--;
    a=b-1;

}

        }
       return true;
    }
}