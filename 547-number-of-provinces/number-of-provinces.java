class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int provinces=0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                dfs(i,isConnected,visited);
            }
        }
        return provinces;
    }
    private void dfs(int node,int[][] isConnected,boolean[] visited){
        visited[node]=true;

        for(int x=0;x<isConnected.length;x++){
            if(isConnected[node][x]==1 && !visited[x]){
                dfs(x,isConnected,visited);
            }
        }
    }
}
