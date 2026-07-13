class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits="123456789";
       List<Integer>result=new ArrayList<>();
      int lowlen= String.valueOf(low).length();
      int highlen= String.valueOf(high).length();

        for(int i=lowlen;i<=highlen;i++){
            
            for(int start=0;start+i<=9;start++){
                int num=Integer.parseInt(digits.substring(start,start+i));
                if(num>=low && num<=high){
                    result.add(num);
                }

            }

        }
        return result;
    }
}