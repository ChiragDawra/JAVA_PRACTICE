class que10{
    public static void main(String[] args){
        int[] arr= {5,3,6,3,7};
        int max = 0;
        for(int i=1;i<arr.length-2;i++){
            if(arr[i]>max){
                max = i;
            }
        }
        if(arr[max]>arr[0] || arr[max]>arr[arr.length-1]){
            if(arr[max]>arr[0]){
                int temp = arr[0];
                arr[0]=arr[max];
                arr[max] = arr[0];
            }
            else{
                arr[5]=arr[max];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}