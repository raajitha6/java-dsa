import java.util.*;
class Main {
    void rotate(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Main obj=new Main();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        t=t%n;
        for(int i=0;i<t;i++){
            obj.rotate(arr);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        
        
    }
}
