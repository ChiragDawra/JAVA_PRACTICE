import java.util.*;

class FamilyPhotoGraph {

    static void reverseInGroups(int[] arr, int n, int k) {
        // WRITE YOUR CODE HERE
        for(int i=0;i<n;i+=k){
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while(i<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        reverseInGroups(arr, n, k);

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}