class que10{
    public static void main(String[] args){
        int[] arr= {5,3,6,3,7};
        int max = 0;
        for(int i=1;i<arr.length-2;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        if(max>arr[0] || max>arr[arr.length]){
            if(max>arr[0]){
                arr[0]=max;
            }
            else{
                arr[5]=max;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}