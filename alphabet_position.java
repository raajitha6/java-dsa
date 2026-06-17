import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="hello";
        char[] charr=s.toCharArray();
        for(char ch:charr){
            System.out.print(ch-96+" ");
        }
    }
}
