class Solution {
    public int[] separateDigits(int[] nums) {
       List<Integer>temp=new ArrayList<>();
       for(int num:nums){
        Stack<Integer>st=new Stack<>();
        while(num>0){
            st.push(num%10);
            num=num/10;

        }
        while(!st.isEmpty()){
            temp.add(st.pop());
        }
       }
  int[] ans = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++){
            ans[i] = temp.get(i);
        }

        return ans;
        
            }
}