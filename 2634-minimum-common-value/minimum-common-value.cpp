class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        int n=nums1.size();
        int m=nums2.size();
        set<int> st(nums1.begin(),nums1.end());
        int mini=INT_MAX;
        for(int i=0;i<m;i++){
            if(st.contains(nums2[i])){
                mini=min(mini,nums2[i]);
            }
        }
        return mini==INT_MAX?-1:mini;
        
    }
};