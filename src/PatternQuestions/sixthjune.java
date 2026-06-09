package PatternQuestions;

import java.util.Scanner;

public class sixthjune {
    public static void main(String[] args) {
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<= 5;i++){
                System.out.print("-");
            }
            for(int j=1;j<= 5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<= k;i++){
                System.out.print("-");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<=5;i++){
                System.out.print("-");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<=k;i++){
                System.out.print("-");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<=5;i++){
                System.out.print("-");
            }
            for(int j=5;j>=k;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for(int i = 5;i>=k;i--){
                System.out.print("-");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int k = 1; k <= 6; k++) {
            for(int i = 1;i<=6-k;i++){
                System.out.print("-");
            }
            for(int j=1;j<=6-k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<=5;i++){
                System.out.print("-");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 5; k++) {
            for(int i = 1;i<=5;i++){
                System.out.print("-");
            }
            for(int j=5;j>=k;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i=1;i<=6;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j == 1 || i==6 || j == 5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int k=1;k<=5;k++){
            for(int i=1;i<=k;i++){
                System.out.print("-");
            }
            for(int j=1;j<= k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int k=5;k>1;k--){
            for(int i=1;i<=k;i++){
                System.out.print("-");
            }
            for(int j=1;j<= k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
