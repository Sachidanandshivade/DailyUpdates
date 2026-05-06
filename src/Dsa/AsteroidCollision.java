package Dsa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] AsteroidC(int[] astero) {
        Stack<Integer> stack = new Stack<>();

        boolean des = false;

        for (int as : astero) {
            while (!stack.isEmpty() && as < 0 && stack.peek() > 0) {
                if (stack.peek() < -as) {
                    stack.pop();
                } else if (stack.peek() == -as) {
                    stack.pop();
                    des = true;
                    break;
                } else {
                    des = true;
                    break;
                }
            }
                if (!des) {
                    stack.push(as);
                }
            }
            int[] result = new int[stack.size()];
            for (int i = result.length - 1; i >= 0; i--) {
                result[i] = stack.pop();
            }
            return result;

        }
        public static void main (String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of asteroids: ");
            int n = sc.nextInt();

            int[] asteroids = new int[n];

            System.out.println("Enter asteroid values:");
            for (int i = 0; i < n; i++) {
                asteroids[i] = sc.nextInt();
            }

            int[] result = AsteroidC(asteroids);

            System.out.println("Final state of asteroids:");
            System.out.println(Arrays.toString(result));

            sc.close();
        }
    }
