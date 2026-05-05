package Dsa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackDSA {

    public static int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                result[prevIndex] = i-prevIndex;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of days");
        int n = sc.nextInt();

        int[] temperatures = new int[n];
        System.out.println("enter the temperatures");
        for(int i=0;i<n;i++){
            temperatures[i]=sc.nextInt();
        }

        int[] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
        sc.close();


    }

}
