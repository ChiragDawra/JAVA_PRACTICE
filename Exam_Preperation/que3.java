import java.util.*;
class que3{
    static String ReduceString(String Num){
        char[] ch = Num.toCharArray();
        int i=0;
        while(ch[i]=='0'){
            i++;
        }
        return Num.substring(i);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Num = sc.nextLine();
        String result = ReduceString(Num);
        System.out.println("Reduced String: "+result);
    }
}