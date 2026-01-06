



class que9{
    public static void main(String[] args){
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int sum1 = 0;
        int sum2 =0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum1 += arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}