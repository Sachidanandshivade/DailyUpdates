public class nestedLoop {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=2;j++){
                System.out.println("Kodnest");
            }
            System.out.println("Hello");
            if(i==3){
                break;
            }
        }
    }
}
