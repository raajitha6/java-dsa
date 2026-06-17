import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="aaaabbbccaabbb";
        char[] charr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++){
            if(charr[i]==charr[i-1]){
                c+=1;
            }
            else{
                sb.append(c);
                sb.append(charr[i]);
                c=1;
            }
        }
        sb.append(c);
        System.out.print(sb);
    }
}
