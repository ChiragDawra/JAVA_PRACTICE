import java.util.*;
// class AntiHacking{
//     static boolean palindromecheck(String s){
//         StringBuilder sb = new StringBuilder(s);
//         if(s.equals(sb.reverse().toString())){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         sc.nextLine();
//         while(T>0){
//             String s = sc.nextLine();
//             boolean checker = palindromecheck(s);
//             if(checker) System.out.println("YES");
//             if(!checker) System.out.println("NO");
//             T--;
//         }
//     }
// }
class AntiHacking {
    static boolean palindromecheck(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            System.out.print("Enter string: ");
            String s = sc.nextLine();
            System.out.println(palindromecheck(s) ? "YES" : "NO");
            T--;
        }
    }
}