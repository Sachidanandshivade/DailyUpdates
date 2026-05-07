package OOps;

import java.util.Scanner;
import java.util.*;

public class Scanners {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.nextLine();

        sc.close();
        System.out.print("this is "+ name + " with "+id);
    }

}
