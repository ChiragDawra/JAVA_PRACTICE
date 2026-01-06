import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int FirstOccurence(int[] arr,int k){
        int start = 0;
        int end = arr.length-1;
        int result=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<k){
                start = mid+1;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else if(arr[mid]==k){
                result = mid;
                end=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            int k= sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans = FirstOccurence(arr,k);
            System.out.println(ans);
            T--;
        }
    }
}