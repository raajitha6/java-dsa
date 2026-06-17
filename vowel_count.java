import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="hello";
        char[] charr=s.toCharArray();
        int vow=0;
        for(char ch:charr){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow+=1;
            }
        }
        System.out.println(vow);
    }
}
