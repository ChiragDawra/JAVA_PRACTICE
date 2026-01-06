import java.util.*;
class que6{
    public static void main(String[] args){
        int[][] seats = {{0,0,0},{0,0,0},{0,0,0}};
        Scanner sc =new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(seats[i][j]==0){
            seats[i][j]=1;
            System.out.println("Avalaible");
        }
        if(seats[i][j]!=0){
            System.out.println("Not Avalaible");
        }
    }
}