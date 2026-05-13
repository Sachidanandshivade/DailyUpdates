package Dsa;

import java.util.HashMap;
import java.util.Scanner;

public class FlightCostMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] airports = new String[n];

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            airports[i] = sc.next();
            map.put(airports[i],i);
        }

        int[][] matrix = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j){
                    matrix[i][j]=0;
                }else{
                    matrix[i][j]= -1;
                }
            }
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            String source = sc.next();
            String destination = sc.next();
            int cost = sc.nextInt();

            int srcIndex = map.get(source);
            int desIndex = map.get(destination);

            matrix[srcIndex][desIndex] = cost;
        }
        System.out.println("Airport Index Mapping: ");

        for(int i=0;i<n;i++){
            System.out.println(airports[i]+ "->" +i);
        }

        System.out.println("\nAdjacency Matrix:");

        System.out.print("      ");

        for (String airport : airports) {
            System.out.print(airport + "    ");
        }

        System.out.println();


        for (int i = 0; i < n; i++) {

            System.out.print(airports[i] + "   ");

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "    ");
            }

            System.out.println();
        }

        sc.close();
    }
}
