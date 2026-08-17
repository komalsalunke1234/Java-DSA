class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int mindistance=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<drones.length;i++){
           
                int manhattan=Math.abs(drones[i][0]-target[0])+
                Math.abs(drones[i][1]-target[1]);
                if(manhattan<=drones[i][2]&& manhattan<mindistance){
                    mindistance=manhattan;
                     ans= i;
                }
            }
            
        
        return ans;
    }
}