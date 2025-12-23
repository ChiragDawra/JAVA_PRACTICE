import java.util.*;
class InsertionSort{
    public static int EnergyRequired(int[] arr , int n){
        int Swaps = 0;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            boolean moved=false;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
                Swaps++;
                moved = true;

            }
            if(moved){
                arr[j+1]=key;
                Swaps++;
            }
        }
        return (Swaps)*4;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the Size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Your"+(i+1)+"th element: ");
            arr[i]=sc.nextInt();
        }
        int Energy = EnergyRequired(arr,n);
        System.out.println(Energy);
    }
}