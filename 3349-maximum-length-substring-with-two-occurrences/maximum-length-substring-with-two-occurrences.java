class Solution {
    public int maximumLengthSubstring(String s) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // int left=0;
        // int maxlength=0;
        // for(int right=0;right<s.length();right++){
        //     map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
        //     while(map.get(left)>2){
        //         map.get(s.charAt(right))
        //     }

        // }

        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                int index=s.charAt(j)-'a';
                freq[index]++;
                if(freq[index]>2){
                    break;
                }
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}