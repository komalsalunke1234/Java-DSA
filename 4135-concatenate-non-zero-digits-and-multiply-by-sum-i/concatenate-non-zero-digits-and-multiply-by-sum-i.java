class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(char ch:s.toCharArray()){
            if(ch!='0'){
                sb.append(ch);
                sum+=ch-'0';
            }
        }
        long x=sb.length() == 0 ? 0 : Integer.parseInt(sb.toString());
        return x*sum;
    }
}