import java.util.*;

class StringGeneratingMachine {

    static boolean StingUniquenessChecker(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
            System.out.print("Enter string: ");
            String s = sc.nextLine();
            System.out.println(StingUniquenessChecker(s) ? "YES" : "NO");
            T--;
        }
    }
}