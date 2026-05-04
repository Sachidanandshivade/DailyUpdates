public class buildCal {
    public static void main(String[] args){
        add(10,10);
        sub(10,10);
        mul(10,10);
        div(10,10);
    }

    public static void sub(int a, int b){
        int c = a-b;
        System.out.println(c);
    }

    public static void mul(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
    public static void add(int a,int b){
        int c= a+b;
        System.out.println(c);
    }
    public static void div(int a,int b){
        int c=a/b;
        System.out.println(c);
    }

}
