class Solution {
    public boolean satisfies(int[] arr,int balls,int dist){
        int curr=arr[0];
        balls=balls-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-curr>=dist){
                balls-=1;
                curr=arr[i];
            }
        }
        if(balls<=0) return true;
        return false;
    }

    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int max=pos[0],min=pos[0];
        for(int i:pos){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        int l=1, r=max-min;
        int idx=max-min;
        while(l<=r){
            int mid=(l+r)/2;
            if(satisfies(pos,m,mid)==true){
                idx=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return idx;

    }
}