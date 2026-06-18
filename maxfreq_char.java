import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="gebuby32gdbuidmeiruxh";
        char[] charr=s.toCharArray();
        LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
        for(char i:charr){
            hm.put((char)i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);
        int max=hm.get(s.charAt(0));
        char maxi=s.charAt(0);
        for(char i:hm.keySet()){
            if(hm.get(i)>=max){ 
                max=hm.get(i);
                maxi = i;
            }
        }
        System.out.println(maxi);
    }
}
