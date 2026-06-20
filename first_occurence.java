import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,1,2,2,2,3,3,3,3,3,4,5,5};
        int n=arr.length;
        int k=2;
        int l=0,r=n-1;
        int idx=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k){
                idx=m;
                r=m-1;
                
            }
            else if(arr[m]>k) r=m-1;
            else l=m+1;
        }
        System.out.println(idx);
    }
}
