class que8{
    static String ReverseString(String st){
        StringBuilder res = new StringBuilder(st);
        return res.reverse().toString();
    }
    public static void main(String[] args){
        String s = "Hello World";
        String[] st = s.split(" ");
        for(int i=0;i<st.length;i++){
            st[i] = ReverseString(st[i]); 
        }
        StringBuilder merge = new StringBuilder();
        for(int i=0;i<st.length;i++){
            merge.append(st[i]);
            merge.append(" ");
        }
        System.out.println(merge);
    }
}