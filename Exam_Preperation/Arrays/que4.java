import java.util.*;
class que4{
    static void Recieve(Stack stack){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        stack.push(number);
    }
    static int Serve(Stack stack){
        return 5;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter Your Choice:- ");
        System.out.println("1. Order ");
        System.out.println("2. Serve");
        while(choice==1 || choice ==2){
            if(choice==1){
                Recieve(stack);
            }
            if(choice==2){
                int num = Serve(stack);
            }
        }
    }
}