class que5{
    public static void main(String[] args){
        String s = "+ 10 20";
        String[] st = s.split(" ");
        if(st[0].equals("+")){
            System.out.println(Integer.parseInt(st[1])+Integer.parseInt(st[2]));
        }
        else if(st[0].equals("-")){
            System.out.println(Integer.parseInt(st[1])-Integer.parseInt(st[2]));
        }
        else if(st[0].equals("/")){
            System.out.println(Integer.parseInt(st[1])/Integer.parseInt(st[2]));
        }
        else if(st[0].equals("*")){
            System.out.println(Integer.parseInt(st[1])*Integer.parseInt(st[2]));
        }
    }
}