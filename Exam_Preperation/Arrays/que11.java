class que11{
    public static void main(String[] args){
        int[] arr = {7,6,5,3,3,2,1};
        int[] k = {9,3,2,-3};
        int sum = 0;
        for(int j = 0;j<k.length;j++){
            int index=-1;
            for(int i=arr.length-1;i>=0;i--){
                if(k[j]==arr[i]){
                    index=i;
                    break;
                }
            }
            sum+=index;
        }
        System.out.println(sum);
    }
}