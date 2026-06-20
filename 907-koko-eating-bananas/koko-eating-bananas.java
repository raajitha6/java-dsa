
class Solution {
    public boolean satisfies(int k,int h,int[] piles){
        int hours=0;
        int f=0;
        for(int i:piles){
            hours= hours+(i+(k-1))/k;
            if(hours>h){
                f=1;
                break;
            }
        }
        if(f==1) return false;
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
       int max=0;
       for(int i:piles){
            if(i>max) max=i;
       }
       if(piles.length==h) return max;
       int l=1,r=max;
       int idx=max;
       while(l<=r){
        int k=(l+r)/2;
        if(satisfies(k,h,piles)==true){
            idx=k;
            r=k-1;
        }
        else{
            l=k+1;
        }
       }
       return idx;

    }
}